package br.com.picpay.application.usecase;

import br.com.picpay.application.core.domain.User;
import br.com.picpay.application.core.exception.EmailException;
import br.com.picpay.application.core.exception.TaxNumberException;
import br.com.picpay.application.core.exception.TransactionPinException;

public interface CreateUserUseCase {

    void create(User user, String pin) throws TaxNumberException, EmailException, TransactionPinException;

}
