package com.example.nordshop.exception;

public class UserNotFoundException extends Exception {
    public UserNotFoundException() {
        super("Usuario nao encontrado.");
    }
}
