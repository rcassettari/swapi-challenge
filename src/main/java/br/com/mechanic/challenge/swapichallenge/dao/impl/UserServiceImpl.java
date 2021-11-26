package br.com.mechanic.challenge.swapichallenge.dao.impl;

import br.com.mechanic.challenge.swapichallenge.dao.UserService;
import br.com.mechanic.challenge.swapichallenge.dto.request.UserChangePasswordRequestDto;
import br.com.mechanic.challenge.swapichallenge.dto.request.NewUserDto;
import br.com.mechanic.challenge.swapichallenge.dto.response.NewUserResponseDto;
import br.com.mechanic.challenge.swapichallenge.dto.response.UserForInternalAuthorizationResponseDto;
import br.com.mechanic.challenge.swapichallenge.entities.Usuario;
import br.com.mechanic.challenge.swapichallenge.exception.*;
import br.com.mechanic.challenge.swapichallenge.mapper.UserMapper;
import br.com.mechanic.challenge.swapichallenge.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserForInternalAuthorizationResponseDto findByEmail(String email) throws UserNotFoundException {
        Optional<Usuario> existingUser = usuarioRepository.findByEmail(email);

        if (existingUser.isEmpty())
            throw new UserNotFoundException(email);

        Usuario usuario = existingUser.get();

        UserForInternalAuthorizationResponseDto userForInternalAuthorizationResponseDto = userMapper.userToUserForInternalAuthorizationResponseDto(usuario);

        return userForInternalAuthorizationResponseDto;
    }

    @Override
    public NewUserResponseDto createUser(NewUserDto newUserDto) throws NewUserByDuplicatedEmailAddressNotAllowed,
            NewUserPasswordAndConfirmationPasswordNotMatchException {

        verifyIfPasswordAndConfirmationPasswordMatch(newUserDto.getSenha(),
                newUserDto.getConfirmacaoSenha(),
                newUserDto.getEmail()
        );

        Usuario usuarioToBeCreated = userMapper.newUserDtoToUser(newUserDto);
        Optional<Usuario> optionalUsuario = usuarioRepository.findByEmail(usuarioToBeCreated.getEmail());

        if (optionalUsuario.isPresent()) {
            Usuario alreadyExistingUser = optionalUsuario.get();
            throw new NewUserByDuplicatedEmailAddressNotAllowed(alreadyExistingUser.getEmail());
        }

        usuarioToBeCreated.setSenha(passwordEncoder.encode(usuarioToBeCreated.getSenha()));
        Usuario userSaved = usuarioRepository.save(usuarioToBeCreated);
        return userMapper.userToNewUserResponseDto(userSaved);
    }

    @Override
    public void updateUserPassword(Long id, UserChangePasswordRequestDto userChangePasswordRequestDto)
            throws
            UserNotFoundException,
            NewUserPasswordAndConfirmationPasswordNotMatchException,
            UserNotAllowedException,
            UserToUpdateMustMatchWithUserFromMailAddressException
    {

        Usuario userToBeUpdated = verifyIfExists(id);
        verifyIfPasswordAndConfirmationPasswordMatch(userChangePasswordRequestDto.getNovaSenha(),
                userChangePasswordRequestDto.getConfirmacaoSenha(),
                userChangePasswordRequestDto.getEmail()
        );

        if( ! userChangePasswordRequestDto.getEmail().equals(userToBeUpdated.getEmail()))
            throw new UserToUpdateMustMatchWithUserFromMailAddressException();

        String userMailAddressFromJwt = getMailAddressFromCurrentJwt();
        List<String> userRoles = getUserAuthoritiesClaimFromCurrentJwt();

        if (!userToBeUpdated.getEmail().equals(userMailAddressFromJwt) )
        {
            if( userRoles == null || ( userRoles != null && !userRoles.contains("ROLE_CHANGE_USER_PASSWORD")))
                throw new UserNotAllowedException(userMailAddressFromJwt, "ROLE_CHANGE_USER_PASSWORD");
        }

        String newEncodedPassword = passwordEncoder.encode(userChangePasswordRequestDto.getNovaSenha());
        usuarioRepository.updateSenhaByCodigo(id, newEncodedPassword);
    }

    private Usuario verifyIfExists(Long id) throws UserNotFoundException {
        return usuarioRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException(id));
    }

    private void verifyIfPasswordAndConfirmationPasswordMatch(String password, String confirmationPassword, String email) throws NewUserPasswordAndConfirmationPasswordNotMatchException {
        if (!password.equals(confirmationPassword))
            throw new NewUserPasswordAndConfirmationPasswordNotMatchException(email);
    }

    private String getMailAddressFromCurrentJwt() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        Jwt jwtFromCurrentContext = (Jwt) authentication.getPrincipal();
        String userMailAddressFromJwt = jwtFromCurrentContext.getClaimAsString("user_name");
        return  userMailAddressFromJwt;
    }

    private List<String> getUserAuthoritiesClaimFromCurrentJwt() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        Jwt jwtFromCurrentContext = (Jwt) authentication.getPrincipal();
        List<String> userAuthoritiesClaim = jwtFromCurrentContext.getClaimAsStringList("authorities");
        return userAuthoritiesClaim;
    }

}
