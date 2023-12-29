package br.com.picpay.application.gateway;

import br.com.picpay.application.core.domain.Transaction;

public interface UserNotificationGateway {

    Boolean notificate(Transaction transaction, String email);

}
