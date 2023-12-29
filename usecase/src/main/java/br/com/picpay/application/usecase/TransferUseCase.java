package br.com.picpay.application.usecase;

import br.com.picpay.application.core.domain.Transaction;
import br.com.picpay.application.core.exception.InternalServerErrorException;
import br.com.picpay.application.core.exception.NotFoundException;
import br.com.picpay.application.core.exception.NotificationException;
import br.com.picpay.application.core.exception.TransferException;

import java.math.BigDecimal;

public interface TransferUseCase {

    Boolean transfer(String fromTaxNumber, String toTaxNumber, BigDecimal value) throws InternalServerErrorException, TransferException, NotFoundException, NotificationException;

}
