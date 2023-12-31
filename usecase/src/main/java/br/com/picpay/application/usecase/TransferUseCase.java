package br.com.picpay.application.usecase;

import br.com.picpay.application.core.domain.Transaction;
import br.com.picpay.application.core.exception.*;

import java.math.BigDecimal;

public interface TransferUseCase {

    Boolean transfer(String fromTaxNumber, String toTaxNumber, BigDecimal value, String pin) throws InternalServerErrorException, TransferException, NotFoundException, NotificationException, PinException;

}
