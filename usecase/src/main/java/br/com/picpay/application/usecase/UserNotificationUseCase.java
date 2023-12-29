package br.com.picpay.application.usecase;

import br.com.picpay.application.core.domain.Transaction;

public interface UserNotificationUseCase {

    Boolean notificate(Transaction transaction, String email);

}
