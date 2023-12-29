package br.com.picpay.application.usecase;

import br.com.picpay.application.core.domain.Transaction;
import br.com.picpay.application.core.exception.TransferException;

public interface CreateTransactionUseCase {

    Transaction create(Transaction transaction) throws TransferException;

}
