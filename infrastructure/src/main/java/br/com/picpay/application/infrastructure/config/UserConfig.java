package br.com.picpay.application.infrastructure.config;

import br.com.picpay.application.gateway.CreateUserGateway;
import br.com.picpay.application.gateway.EmailAvailableGateway;
import br.com.picpay.application.gateway.TaxNumberAvailableGateway;
import br.com.picpay.application.usecase.CreateUserUseCase;
import br.com.picpay.application.usecase.EmailAvailableUseCase;
import br.com.picpay.application.usecase.TaxNumberAvailableUseCase;
import br.com.picpay.application.usecaseimpl.CreateUserUseCaseImpl;
import br.com.picpay.application.usecaseimpl.EmailAvailableUseCaseImpl;
import br.com.picpay.application.usecaseimpl.TaxNumberAvailableUseCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

    @Bean
    public TaxNumberAvailableUseCase taxNumberAvailableUseCase(TaxNumberAvailableGateway taxNumberAvailableGateway) {
        return new TaxNumberAvailableUseCaseImpl(taxNumberAvailableGateway);
    }

    @Bean
    public EmailAvailableUseCase emailAvailableUseCase(EmailAvailableGateway emailAvailableGateway) {
        return new EmailAvailableUseCaseImpl(emailAvailableGateway);
    }

    @Bean
    public CreateUserUseCase createUserUseCase(TaxNumberAvailableUseCase taxNumberAvailableUseCase, EmailAvailableUseCase emailAvailableUseCase, CreateUserGateway createUserGateway) {
        return new CreateUserUseCaseImpl(taxNumberAvailableUseCase, emailAvailableUseCase, createUserGateway);
    }

}
