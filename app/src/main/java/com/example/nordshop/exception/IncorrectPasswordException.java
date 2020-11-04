package com.example.nordshop.exception;

public class IncorrectPasswordException extends Exception {
    public IncorrectPasswordException() {
        super("Senha invalida.");
    }
}
