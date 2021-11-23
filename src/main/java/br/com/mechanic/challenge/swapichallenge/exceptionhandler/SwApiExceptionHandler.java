package br.com.mechanic.challenge.swapichallenge.exceptionhandler;

import br.com.mechanic.challenge.swapichallenge.error.ErrorDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class SwApiExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler({feign.FeignException.NotFound.class})
    protected ResponseEntity<Object> handleResourceNotFoundException( WebRequest request) {

        ErrorDetails errorDetails = new ErrorDetails();
        errorDetails.setStatus(HttpStatus.NOT_FOUND.value());
        errorDetails.setDetails(HttpStatus.NOT_FOUND.name());                ;

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorDetails);
    }
}
