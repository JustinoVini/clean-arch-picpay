package br.com.picpay.application.infrastructure.service;

import br.com.picpay.application.gateway.TaxNumberAvailableGateway;
import br.com.picpay.application.infrastructure.repository.UserEntityRepository;
import org.springframework.stereotype.Service;

import static br.com.picpay.application.infrastructure.utils.Utilities.log;

@Service
public class TaxNumberAvailableGatewayImpl implements TaxNumberAvailableGateway {

    private UserEntityRepository userEntityRepository;

    public TaxNumberAvailableGatewayImpl(UserEntityRepository userEntityRepository) {
        this.userEntityRepository = userEntityRepository;
    }

    @Override
    public Boolean taxNumberAvailable(String taxNumber) {
        log.info("Inicios da verificação se o TaxNumber está disponível");
        return !userEntityRepository.existsByTaxNumber(taxNumber);
    }

}
