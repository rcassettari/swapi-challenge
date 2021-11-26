package br.com.mechanic.challenge.swapichallenge.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.FORBIDDEN)
public class UserNotAllowedException extends Exception {
    public UserNotAllowedException(String currentUserMailAddress, String actionName) {
        super("The current user [" + currentUserMailAddress + "] cannot has access to " + actionName);
    }
}