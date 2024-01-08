package br.com.picpay.application.infrastructure.service;

import br.com.picpay.application.gateway.EmailAvailableGateway;
import br.com.picpay.application.infrastructure.repository.UserEntityRepository;
import org.springframework.stereotype.Service;

@Service
public class EmailAvailableGatewayImpl implements EmailAvailableGateway {

    private UserEntityRepository userEntityRepository;

    public EmailAvailableGatewayImpl(UserEntityRepository userEntityRepository) {
        this.userEntityRepository = userEntityRepository;
    }

    @Override
    public Boolean emailAvailable(String email) {
        return !userEntityRepository.existsByEmail(email);
    }

}
