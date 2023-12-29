package br.com.picpay.application.core.exception.enums;

public enum ErrorCodeEnum {

    ON0001("Invalid Tax Number", "ON-0001"),

    ON0002("Tax Number Not Available", "ON-0002"),

    ON0003("Email Not Available", "ON-0003"),

    ON0004("There was an error creating the user", "ON-0004"),

    TR0001("Merchant user does not have the transfer function available.", "TR-0001"),

    TR0002("Unavailable balance.", "TR-0002"),

    TR0003("There was an error creating the transfer.", "TR-0003"),

    TR0004("Transfer not authorized.", "TR-0004"),

    TRP0001("Invalid pin", "TRP-0001"),

    WA0001("Wallet not found", "WA-0001"),

    NO0001("There was an Error Notifying the user", "NO-0001"),

    ATH0001("There was an error in authentication", "ATH-0001"),

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
