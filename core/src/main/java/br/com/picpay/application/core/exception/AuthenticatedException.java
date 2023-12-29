package br.com.picpay.application.core.exception;

public class AuthenticatedException extends Exception {

    private String code;

    public AuthenticatedException(String message, String code) {
        super(message);
        this.code = code;
    }

}