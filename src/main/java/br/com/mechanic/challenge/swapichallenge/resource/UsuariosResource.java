package br.com.mechanic.challenge.swapichallenge.resource;

import br.com.mechanic.challenge.swapichallenge.dao.UserService;
import br.com.mechanic.challenge.swapichallenge.dto.request.UserChangePasswordRequestDto;
import br.com.mechanic.challenge.swapichallenge.dto.request.UserDtoRequest;
import br.com.mechanic.challenge.swapichallenge.dto.response.UserDtoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/usuarios")
public class UsuariosResource {

    @Autowired
    UserService userService;

    @PostMapping
    public ResponseEntity<UserDtoResponse> createUser(@RequestBody @Valid UserDtoRequest userDtoRequest)
    {
        UserDtoResponse userDtoResponse = userService.createUser(userDtoRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(userDtoResponse);
    }

    @PostMapping("/{id}/alterarSenha")
    public ResponseEntity updateUserPassword(@PathVariable Long id, @RequestBody @Valid UserChangePasswordRequestDto userChangePasswordRequestDto)
    {
        userService.updateUserPassword(id, userChangePasswordRequestDto);
        return ResponseEntity.noContent().build();
    }

}
