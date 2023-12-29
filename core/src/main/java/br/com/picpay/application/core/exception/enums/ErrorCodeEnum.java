package br.com.picpay.application.core.exception.enums;

public enum ErrorCodeEnum {

    ON0001("Invalid Tax Number", "ON-0001"),

    ON0002("Tax Number Not Available", "ON-0002"),

    ON0003("Email Not Available", "ON-0003"),

    TR0001("Merchant user does not have the transfer function available.", "TR-0001"),

    TR0002("Unavailable balance.", "TR-0002"),

    TRP0001("Invalid pin", "TRP-0001")

    ;
    private String message;
    private String code;

    ErrorCodeEnum(String message, String code) {
        this.message = message;
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
