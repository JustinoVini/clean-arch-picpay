package br.com.picpay.application.usecase;

import br.com.picpay.application.core.domain.TransactionPin;

public interface CreateTransactionPinUseCase {

    void create(TransactionPin transactionPin);

}
