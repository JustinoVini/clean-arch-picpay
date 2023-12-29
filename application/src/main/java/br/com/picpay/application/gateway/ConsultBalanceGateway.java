package br.com.picpay.application.gateway;

import br.com.picpay.application.core.domain.Wallet;

import java.math.BigDecimal;

public interface ConsultBalanceGateway {

    BigDecimal consult(Wallet wallet);

}
