package br.com.picpay.application.usecase;

import br.com.picpay.application.core.domain.TransactionPin;
import br.com.picpay.application.core.exception.PinException;
import br.com.picpay.application.core.exception.TransferException;

public interface TransactionPinValidateUseCase {

    Boolean validate(TransactionPin transactionPin) throws TransferException, PinException;

}
