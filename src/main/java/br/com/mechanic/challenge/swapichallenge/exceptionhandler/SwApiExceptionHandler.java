package br.com.mechanic.challenge.swapichallenge.exceptionhandler;

import br.com.mechanic.challenge.swapichallenge.error.ErrorDetails;
import br.com.mechanic.challenge.swapichallenge.exception.NewUserByDuplicatedEmailAddressNotAllowed;
import br.com.mechanic.challenge.swapichallenge.exception.NewUserPasswordAndConfirmationPasswordNotMatchException;
import br.com.mechanic.challenge.swapichallenge.exception.UserNotAllowedException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.persistence.EntityNotFoundException;

@ControllerAdvice
public class SwApiExceptionHandler extends ResponseEntityExceptionHandler {

    /**
     * Intercepts feign.FeignException.NotFound to avoid error HTTP 500 when a
     * call to external REST API using a resource not found.
     *
     */
    @ExceptionHandler({feign.FeignException.NotFound.class})
    protected ResponseEntity<Object> handleResourceNotFoundException( WebRequest request) {

        ErrorDetails errorDetails = new ErrorDetails();
        errorDetails.setStatus(HttpStatus.NOT_FOUND.value());
        errorDetails.setDetails(HttpStatus.NOT_FOUND.name());                ;

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorDetails);
    }

    /**
     *  Called when exception type EntityNotFoundException is raised.
     *  Specifically used to get details about the entity not found, improving the message
     *  used. Will be used to allow future extension for more resources, because it´s a more generic exception type.
     */
    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<?> handleResourceNotFoundException(EntityNotFoundException ex,
                                                         WebRequest request) {

        String detail = ex.getMessage();

        ErrorDetails errorDetails = new ErrorDetails();
        errorDetails.setStatus(HttpStatus.NOT_FOUND.value());
        errorDetails.setDetails(detail);

        return handleExceptionInternal(ex,errorDetails, new HttpHeaders(), HttpStatus.NOT_FOUND, request);
    }

    @ExceptionHandler(NewUserByDuplicatedEmailAddressNotAllowed.class)
    public ResponseEntity<?> handleResourceNotFoundException(NewUserByDuplicatedEmailAddressNotAllowed ex,
                                                             WebRequest request) {

        String detail = ex.getMessage();

        ErrorDetails errorDetails = new ErrorDetails();
        errorDetails.setStatus(HttpStatus.UNPROCESSABLE_ENTITY.value());
        errorDetails.setDetails(detail);

        return handleExceptionInternal(ex,errorDetails, new HttpHeaders(), HttpStatus.UNPROCESSABLE_ENTITY, request);
    }

    @ExceptionHandler(NewUserPasswordAndConfirmationPasswordNotMatchException.class)
    public ResponseEntity<?> handleNewUserPasswordAndConfirmationPasswordNotMatchException(NewUserPasswordAndConfirmationPasswordNotMatchException ex,
                                                             WebRequest request) {

        String detail = ex.getMessage();

        ErrorDetails errorDetails = new ErrorDetails();
        errorDetails.setStatus(HttpStatus.BAD_REQUEST.value());
        errorDetails.setDetails(detail);

        return handleExceptionInternal(ex,errorDetails, new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
    }

    @ExceptionHandler(UserNotAllowedException.class)
    public ResponseEntity<?> handleUserNotAllowedException(UserNotAllowedException ex, WebRequest request) {

        String detail = ex.getMessage();

        ErrorDetails errorDetails = new ErrorDetails();
        errorDetails.setStatus(HttpStatus.FORBIDDEN.value());
        errorDetails.setDetails(detail);

        return handleExceptionInternal(ex,errorDetails, new HttpHeaders(), HttpStatus.FORBIDDEN, request);
    }

}
