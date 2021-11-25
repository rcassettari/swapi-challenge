package br.com.mechanic.challenge.swapichallenge.dao;

import br.com.mechanic.challenge.swapichallenge.dto.request.UserChangePasswordRequestDto;
import br.com.mechanic.challenge.swapichallenge.dto.request.UserDtoRequest;
import br.com.mechanic.challenge.swapichallenge.dto.response.UserDtoResponse;
import br.com.mechanic.challenge.swapichallenge.entities.Usuario;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public interface UserService {

    // TODO: Remove usuario do service. Use Dto.
    public Optional<Usuario> findByEmail(String email);

    public UserDtoResponse createUser(UserDtoRequest userDtoRequest);

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void updateUserPassword(Long id, UserChangePasswordRequestDto userChangePasswordRequestDto );
}
