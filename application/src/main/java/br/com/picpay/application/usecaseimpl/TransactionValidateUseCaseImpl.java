package br.com.picpay.application.usecaseimpl;

import br.com.picpay.application.core.domain.Transaction;
import br.com.picpay.application.core.exception.TransferException;
import br.com.picpay.application.core.exception.enums.ErrorCodeEnum;
import br.com.picpay.application.gateway.TransactionValidateGateway;
import br.com.picpay.application.usecase.TransactionValidateUseCase;

public class TransactionValidateUseCaseImpl implements TransactionValidateUseCase {

    private TransactionValidateGateway transactionValidateGateway;

    @Override
    public Boolean validate(Transaction transaction) throws TransferException {
        if (!transactionValidateGateway.validate(transaction)) {
            throw new TransferException(ErrorCodeEnum.TR0004.getMessage(), ErrorCodeEnum.TR0004.getCode());
        }

        return true;
    }
}
