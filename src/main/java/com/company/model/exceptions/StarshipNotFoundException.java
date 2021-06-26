package com.company.model.exceptions;

public class StarshipNotFoundException extends RuntimeException {

    public StarshipNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public StarshipNotFoundException(String message) {
        super(message);
    }

    public StarshipNotFoundException(Throwable cause) {
        super(cause);
    }
}
