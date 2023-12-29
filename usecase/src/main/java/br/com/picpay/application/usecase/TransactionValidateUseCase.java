package br.com.picpay.application.usecase;

import br.com.picpay.application.core.domain.Transaction;

public interface TransactionValidateUseCase {

    Boolean validate(Transaction transaction);

}
