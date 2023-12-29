package br.com.picpay.application.usecaseimpl;

import br.com.picpay.application.core.exception.AuthenticatedException;
import br.com.picpay.application.core.exception.enums.ErrorCodeEnum;
import br.com.picpay.application.gateway.UserAuthenticateGateway;
import br.com.picpay.application.usecase.UserAuthenticateUseCase;

import javax.naming.AuthenticationException;

public class UserAuthenticateUseCaseImpl implements UserAuthenticateUseCase {

    private UserAuthenticateGateway userAuthenticateGateway;

    public UserAuthenticateUseCaseImpl(UserAuthenticateGateway userAuthenticateGateway) {
        this.userAuthenticateGateway = userAuthenticateGateway;
    }

    @Override
    public Boolean authenticate(String username, String password) throws AuthenticatedException {
        if (!userAuthenticateGateway.authenticated(username, password)) {
            throw new AuthenticatedException(ErrorCodeEnum.ATH0001.getMessage(), ErrorCodeEnum.ATH0001.getCode());
        }

        return true;
    }

}
