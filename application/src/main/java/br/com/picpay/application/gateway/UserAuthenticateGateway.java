package br.com.picpay.application.gateway;

public interface UserAuthenticateGateway {

    Boolean authenticated(String username, String password);

}
