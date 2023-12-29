package br.com.picpay.application.usecase;

import br.com.picpay.application.core.domain.Wallet;

import java.math.BigDecimal;

public interface ConsultBalanceUseCase {

    BigDecimal consult(Wallet wallet);

}
