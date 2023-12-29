package br.com.picpay.application.gateway;

import br.com.picpay.application.core.domain.TransactionPin;

public interface CreateTransactionPinGateway {

    void create(TransactionPin transactionPin);

}
