package br.com.picpay.application.gateway;

import br.com.picpay.application.core.domain.Transaction;

public interface TransactionValidateGateway {

    Boolean validate(Transaction transaction);

}
