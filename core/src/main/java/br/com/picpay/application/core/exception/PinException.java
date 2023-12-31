package br.com.picpay.application.core.exception;

public class PinException extends Throwable {

    private String code;

    public PinException(String message, String code) {
        super(message);
        this.code = code;
    }
}
