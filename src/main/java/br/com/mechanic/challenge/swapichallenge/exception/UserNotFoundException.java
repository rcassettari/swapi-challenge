package br.com.mechanic.challenge.swapichallenge.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.persistence.EntityNotFoundException;

@ResponseStatus( HttpStatus.NOT_FOUND )
public class UserNotFoundException extends EntityNotFoundException {
    public UserNotFoundException(Long id) {
        super("User not found with ID:" + id);
    }
    public UserNotFoundException(String email) {
        super("User not found with mail address:" + email);
    }
}
