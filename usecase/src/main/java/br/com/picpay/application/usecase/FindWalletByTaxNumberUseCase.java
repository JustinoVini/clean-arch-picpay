package br.com.picpay.application.usecase;

import br.com.picpay.application.core.domain.Wallet;
import br.com.picpay.application.core.exception.NotFoundException;

public interface FindWalletByTaxNumberUseCase {

    Wallet findByTaxNumber(String taxNumber) throws NotFoundException;

}
