package com.company.model.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StarshipRestExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<StarshipNotFoundStackTrace> handleException(StarshipNotFoundException exc) {

        StarshipNotFoundStackTrace stackTrace = new StarshipNotFoundStackTrace();

        stackTrace.setStatus(HttpStatus.NOT_FOUND.value());
        stackTrace.setMessage(exc.getMessage());
        stackTrace.setTimeStamp(System.currentTimeMillis());

        return new ResponseEntity<>(stackTrace, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<StarshipNotFoundStackTrace> handleException(Exception exc) {

        StarshipNotFoundStackTrace stackTrace = new StarshipNotFoundStackTrace();

        String message = String.valueOf(exc.getCause());

        message = message.substring(33);

        stackTrace.setStatus(HttpStatus.BAD_REQUEST.value());
        stackTrace.setMessage("Starship id not found - " + message);
        stackTrace.setTimeStamp(System.currentTimeMillis());

        return new ResponseEntity<>(stackTrace, HttpStatus.NOT_FOUND);
    }
}
