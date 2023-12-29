package br.com.picpay.application.core.domain;

import br.com.picpay.application.core.domain.enums.UserTypeEnum;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

public class User {

    private UUID id;
    private String email;
    private String password;
    private TaxNumber taxNumber;
    private String fullname;
    private UserTypeEnum type;
    private TransactionPin transactionPin;
    private LocalDateTime createdAt;
    private LocalDateTime udaptedAt;

    public User(UUID id, String email, String password, TaxNumber taxNumber, String fullname, UserTypeEnum type, TransactionPin transactionPin, LocalDateTime createdAt, LocalDateTime udaptedAt) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.taxNumber = taxNumber;
        this.fullname = fullname;
        this.type = type;
        this.transactionPin = transactionPin;
        this.createdAt = createdAt;
        this.udaptedAt = udaptedAt;
    }

    public User(String email, String password, TaxNumber taxNumber, String fullname, UserTypeEnum type, TransactionPin transactionPin) {
        this.email = email;
        this.password = password;
        this.taxNumber = taxNumber;
        this.fullname = fullname;
        this.type = type;
        this.transactionPin = transactionPin;
    }

    public User() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public TaxNumber getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(TaxNumber taxNumber) {
        this.taxNumber = taxNumber;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public UserTypeEnum getType() {
        return type;
    }

    public void setType(UserTypeEnum type) {
        this.type = type;
    }

    public TransactionPin getTransactionPin() {
        return transactionPin;
    }

    public void setTransactionPin(TransactionPin transactionPin) {
        this.transactionPin = transactionPin;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUdaptedAt() {
        return udaptedAt;
    }

    public void setUdaptedAt(LocalDateTime udaptedAt) {
        this.udaptedAt = udaptedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (!id.equals(user.id)) return false;
        if (!email.equals(user.email)) return false;
        if (!password.equals(user.password)) return false;
        if (!taxNumber.equals(user.taxNumber)) return false;
        if (!fullname.equals(user.fullname)) return false;
        if (type != user.type) return false;
        if (!transactionPin.equals(user.transactionPin)) return false;
        if (!createdAt.equals(user.createdAt)) return false;
        return Objects.equals(udaptedAt, user.udaptedAt);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + email.hashCode();
        result = 31 * result + password.hashCode();
        result = 31 * result + taxNumber.hashCode();
        result = 31 * result + fullname.hashCode();
        result = 31 * result + type.hashCode();
        result = 31 * result + transactionPin.hashCode();
        result = 31 * result + createdAt.hashCode();
        result = 31 * result + (udaptedAt != null ? udaptedAt.hashCode() : 0);
        return result;
    }
}
