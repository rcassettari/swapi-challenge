package br.com.mechanic.challenge.swapichallenge.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus( HttpStatus.UNPROCESSABLE_ENTITY )
public class NewUserByDuplicatedEmailAddressNotAllowed extends Exception {
    public NewUserByDuplicatedEmailAddressNotAllowed(String duplicatedMailAddress) {
        super("A user for specified mail address [" + duplicatedMailAddress + "] already exists.");
    }
}
