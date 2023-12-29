package br.com.picpay.application.usecase;

import br.com.picpay.application.core.domain.User;

public interface FindUserByTaxNumberUseCase {

    User foundByTaxNumber(String taxNumber);

}
