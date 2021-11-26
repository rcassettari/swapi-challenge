package br.com.mechanic.challenge.swapichallenge.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus( HttpStatus.BAD_REQUEST )
public class NewUserPasswordAndConfirmationPasswordNotMatchException extends Exception {
    public NewUserPasswordAndConfirmationPasswordNotMatchException(String duplicatedMailAddress) {
        super("The password and confirmationPassword don´t match for the user with mail address [" + duplicatedMailAddress + "]");
    }
}