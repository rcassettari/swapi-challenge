package br.com.mechanic.challenge.swapichallenge.resource;

import br.com.mechanic.challenge.swapichallenge.dao.UserService;
import br.com.mechanic.challenge.swapichallenge.dto.request.NewUserDto;
import br.com.mechanic.challenge.swapichallenge.dto.request.UserChangePasswordRequestDto;
import br.com.mechanic.challenge.swapichallenge.dto.response.NewUserResponseDto;
import br.com.mechanic.challenge.swapichallenge.exception.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/usuarios")
public class UsuariosResource {

    @Autowired
    UserService userService;

    @PostMapping
    @PreAuthorize("hasAuthority('ROLE_CREATE_USER')")
    public ResponseEntity<NewUserResponseDto> createUser(@RequestBody @Valid NewUserDto newUserDto) throws
            NewUserByDuplicatedEmailAddressNotAllowed,
            NewUserPasswordAndConfirmationPasswordNotMatchException {
        NewUserResponseDto newUserResponseDto = userService.createUser(newUserDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(newUserResponseDto);
    }

    @PostMapping("/{id}/alterarSenha")
    public ResponseEntity updateUserPassword(@PathVariable Long id, @RequestBody @Valid UserChangePasswordRequestDto userChangePasswordRequestDto
                                             ) throws
            UserNotFoundException,
            NewUserPasswordAndConfirmationPasswordNotMatchException,
            UserNotAllowedException, UserToUpdateMustMatchWithUserFromMailAddressException {
        userService.updateUserPassword(id, userChangePasswordRequestDto);
        return ResponseEntity.noContent().build();
    }

}
