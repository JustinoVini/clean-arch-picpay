package br.com.picpay.application.gateway;

import br.com.picpay.application.core.domain.TransactionPin;

public interface TransactionPinValidateGateway {

    Boolean validate(TransactionPin transactionPin);

}
