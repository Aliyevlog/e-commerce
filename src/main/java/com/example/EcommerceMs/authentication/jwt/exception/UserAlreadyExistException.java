package com.example.EcommerceMs.authentication.jwt.exception;

public class UserAlreadyExistException extends RuntimeException {
    public UserAlreadyExistException(String message) {

        super(message);
    }
}
