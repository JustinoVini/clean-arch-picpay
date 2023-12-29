package br.com.picpay.application.gateway;

import br.com.picpay.application.core.domain.Wallet;

public interface FindWalletByTaxNumberGateway {

    Wallet findByTaxNumber(String taxNumber);

}
