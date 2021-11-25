package br.com.mechanic.challenge.swapichallenge.dao.impl;

import br.com.mechanic.challenge.swapichallenge.dao.UserService;
import br.com.mechanic.challenge.swapichallenge.dto.request.UserChangePasswordRequestDto;
import br.com.mechanic.challenge.swapichallenge.dto.request.UserDtoRequest;
import br.com.mechanic.challenge.swapichallenge.dto.response.UserDtoResponse;
import br.com.mechanic.challenge.swapichallenge.entities.Usuario;
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
    public Optional<Usuario> findByEmail(String email)
    {
        // TODO : Preciso das permissões aqui
        return usuarioRepository.findByEmail(email);
    }

    @Override
    public UserDtoResponse createUser(UserDtoRequest userDtoRequest) {
        Usuario usuarioToBeCreated = userMapper.userDtoRequestToUser(userDtoRequest);
        usuarioToBeCreated.setSenha(passwordEncoder.encode(usuarioToBeCreated.getSenha()));
        Usuario userSaved = usuarioRepository.save(usuarioToBeCreated);
        return userMapper.userToUserDtoResponse(userSaved);
    }

    // TODO: Usuario só pode mudar a senha dele mesmo....409 CONFLICT.
    // TODO : Admin pode mudar a senha de todo mundo...
    @Override
    public void updateUserPassword(Long id, UserChangePasswordRequestDto userChangePasswordRequestDto) throws UserNotFoundException {
        verifyIfExists(id);
        String newPasswordEncoded = passwordEncoder.encode(userChangePasswordRequestDto.getNovaSenha());
        usuarioRepository.updateSenhaByCodigo(id, newPasswordEncoded);
    }

    private Usuario verifyIfExists(Long id) throws UserNotFoundException {
        return usuarioRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException(id));
    }
}
