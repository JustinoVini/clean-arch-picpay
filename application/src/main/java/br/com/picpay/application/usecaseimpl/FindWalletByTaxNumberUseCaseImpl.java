package br.com.picpay.application.usecaseimpl;

import br.com.picpay.application.core.domain.Wallet;
import br.com.picpay.application.core.exception.NotFoundException;
import br.com.picpay.application.core.exception.enums.ErrorCodeEnum;
import br.com.picpay.application.gateway.FindWalletByTaxNumberGateway;
import br.com.picpay.application.usecase.FindWalletByTaxNumberUseCase;

public class FindWalletByTaxNumberUseCaseImpl implements FindWalletByTaxNumberUseCase {

    private FindWalletByTaxNumberGateway findWalletByTaxNumberGateway;

    public FindWalletByTaxNumberUseCaseImpl(FindWalletByTaxNumberGateway findWalletByTaxNumberGateway) {
        this.findWalletByTaxNumberGateway = findWalletByTaxNumberGateway;
    }

    @Override
    public Wallet findByTaxNumber(String taxNumber) throws NotFoundException {
        var wallet = findWalletByTaxNumberGateway.findByTaxNumber(taxNumber);

        if (wallet == null) {
            throw new NotFoundException(ErrorCodeEnum.WA0001.getMessage(), ErrorCodeEnum.WA0001.getCode());
        }

        return wallet;
    }

}
