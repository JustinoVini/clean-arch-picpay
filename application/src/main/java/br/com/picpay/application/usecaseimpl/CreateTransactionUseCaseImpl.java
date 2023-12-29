package br.com.picpay.application.usecaseimpl;

import br.com.picpay.application.core.domain.Transaction;
import br.com.picpay.application.core.exception.TransferException;
import br.com.picpay.application.core.exception.enums.ErrorCodeEnum;
import br.com.picpay.application.gateway.CreateTransactionGateway;
import br.com.picpay.application.usecase.CreateTransactionUseCase;

public class CreateTransactionUseCaseImpl implements CreateTransactionUseCase {

    private CreateTransactionGateway createTransactionGateway;

    public CreateTransactionUseCaseImpl(CreateTransactionGateway createTransactionGateway) {
        this.createTransactionGateway = createTransactionGateway;
    }

    @Override
    public Transaction create(Transaction transaction) throws TransferException {

        var transactionSaved = createTransactionGateway.create(transaction);

        if (transactionSaved == null) {
            throw new TransferException(ErrorCodeEnum.TR0003.getMessage(), ErrorCodeEnum.TR0003.getCode());
        }

        return transactionSaved;
    }

}
