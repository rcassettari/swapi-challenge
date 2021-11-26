package br.com.mechanic.challenge.swapichallenge.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus( HttpStatus.BAD_REQUEST )
public class UserToUpdateMustMatchWithUserFromMailAddressException extends Exception {
    public UserToUpdateMustMatchWithUserFromMailAddressException() {
        super("The user id informed does not match the user mailAddress informed.");
    }
}