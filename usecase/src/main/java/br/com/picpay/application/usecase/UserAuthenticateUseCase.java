package br.com.picpay.application.usecase;

import br.com.picpay.application.core.exception.AuthenticatedException;

public interface UserAuthenticateUseCase {

    Boolean authenticate(String username, String password) throws AuthenticatedException;

}
