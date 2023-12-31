package br.com.picpay.application.usecase;

import br.com.picpay.application.core.domain.TransactionPin;

public interface UpdateTransactionPinUseCase {

    TransactionPin update(TransactionPin transactionPin);

}
