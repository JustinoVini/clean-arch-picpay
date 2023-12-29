package br.com.picpay.application.usecaseimpl;

import br.com.picpay.application.core.domain.TransactionPin;
import br.com.picpay.application.core.domain.User;
import br.com.picpay.application.core.domain.Wallet;
import br.com.picpay.application.core.exception.EmailException;
import br.com.picpay.application.core.exception.InternalServerErrorException;
import br.com.picpay.application.core.exception.TaxNumberException;
import br.com.picpay.application.core.exception.TransactionPinException;
import br.com.picpay.application.core.exception.enums.ErrorCodeEnum;
import br.com.picpay.application.gateway.CreateUserGateway;
import br.com.picpay.application.usecase.*;

import java.math.BigDecimal;

public class CreateUserUseCaseImpl implements CreateUserUseCase {

    private TaxNumberAvailableUseCase taxNumberAvailableUseCase;

    private EmailAvailableUseCase emailAvailableUseCase;

    private CreateUserGateway createUserGateway;

    public CreateUserUseCaseImpl(TaxNumberAvailableUseCase taxNumberAvailableUseCase, EmailAvailableUseCase emailAvailableUseCase, CreateUserGateway createUserGateway) {
        this.taxNumberAvailableUseCase = taxNumberAvailableUseCase;
        this.emailAvailableUseCase = emailAvailableUseCase;
        this.createUserGateway = createUserGateway;
    }

    @Override
    public void create(User user, String pin) throws TaxNumberException, EmailException, TransactionPinException, InternalServerErrorException {
        if (!taxNumberAvailableUseCase.TaxNumberAvailable(user.getTaxNumber().getValue())) {
            throw new TaxNumberException(ErrorCodeEnum.ON0002.getMessage(), ErrorCodeEnum.ON0002.getCode());
        }

        if (!emailAvailableUseCase.emailAvailableEmail(user.getEmail())) {
            throw new EmailException(ErrorCodeEnum.ON0003.getMessage(), ErrorCodeEnum.ON0003.getCode());
        }

        if (!createUserGateway.create(user, new Wallet(BigDecimal.ZERO, user), new TransactionPin(user, pin))) {
            throw new InternalServerErrorException(ErrorCodeEnum.ON0004.getMessage(), ErrorCodeEnum.ON0004.getCode());
        }

    }

}
