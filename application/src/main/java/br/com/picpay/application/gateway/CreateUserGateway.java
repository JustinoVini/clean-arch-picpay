package br.com.picpay.application.gateway;

import br.com.picpay.application.core.domain.TransactionPin;
import br.com.picpay.application.core.domain.User;
import br.com.picpay.application.core.domain.Wallet;

public interface CreateUserGateway {

    Boolean create(User user, Wallet wallet);

}
