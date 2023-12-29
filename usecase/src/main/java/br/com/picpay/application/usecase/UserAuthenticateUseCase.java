package br.com.picpay.application.usecase;

public interface UserAuthenticateUseCase {

    Boolean authenticate(String username, String password);

}
