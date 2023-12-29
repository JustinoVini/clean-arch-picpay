package br.com.picpay.application.core.exception;

public class TransferException extends Throwable {

    private String code;

    public TransferException(String message, String code) {
        super(message);
        this.code = code;
    }
}
