package com.mayur.movzart.exception;

public class NotFoundException extends RuntimeException{
    private final String message;

    public NotFoundException(String message) {
        super(message);
        this.message = message;
    }
}
