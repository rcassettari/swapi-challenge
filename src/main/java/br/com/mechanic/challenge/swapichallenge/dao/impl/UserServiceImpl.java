package br.com.mechanic.challenge.swapichallenge.dao.impl;

import br.com.mechanic.challenge.swapichallenge.dao.UserService;
import br.com.mechanic.challenge.swapichallenge.dto.request.UserChangePasswordRequestDto;
import br.com.mechanic.challenge.swapichallenge.dto.request.NewUserDto;
import br.com.mechanic.challenge.swapichallenge.dto.response.NewUserResponseDto;
import br.com.mechanic.challenge.swapichallenge.dto.response.UserForInternalAuthorizationResponseDto;
import br.com.mechanic.challenge.swapichallenge.entities.Usuario;
import br.com.mechanic.challenge.swapichallenge.exception.NewUserByDuplicatedEmailAddressNotAllowed;
import br.com.mechanic.challenge.swapichallenge.exception.NewUserPasswordAndConfirmationPasswordNotMatchException;
import br.com.mechanic.challenge.swapichallenge.exception.UserNotFoundException;
import br.com.mechanic.challenge.swapichallenge.mapper.UserMapper;
import br.com.mechanic.challenge.swapichallenge.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

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
            NewUserPasswordAndConfirmationPasswordNotMatchException
    {

        verifyIfExists(id);
        verifyIfPasswordAndConfirmationPasswordMatch(userChangePasswordRequestDto.getNovaSenha(),
                userChangePasswordRequestDto.getConfirmacaoSenha(),
                userChangePasswordRequestDto.getEmail()
        );

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

}
