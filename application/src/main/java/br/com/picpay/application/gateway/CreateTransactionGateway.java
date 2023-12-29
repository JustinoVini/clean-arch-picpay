package br.com.picpay.application.gateway;

import br.com.picpay.application.core.domain.Transaction;

public interface CreateTransactionGateway {

    Transaction create(Transaction transaction);

}
