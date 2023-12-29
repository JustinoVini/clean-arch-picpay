package br.com.picpay.application.usecase;

import br.com.picpay.application.core.domain.Transaction;

public interface CreateTransactionUseCase {

    void create(Transaction transaction);

}
