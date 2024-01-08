package br.com.picpay.application.infrastructure.mapper;

import br.com.picpay.application.core.domain.Wallet;
import br.com.picpay.application.infrastructure.entity.TransactionPinEntity;
import br.com.picpay.application.infrastructure.entity.UserEntity;
import br.com.picpay.application.infrastructure.entity.WalletEntity;
import org.springframework.stereotype.Component;

@Component
public class WalletMapper {

    public WalletEntity toWalletEntity(Wallet wallet, UserEntity userEntity, TransactionPinEntity transactionPinEntity) {
        return new WalletEntity(
                wallet.getBalance(),
                userEntity,
                transactionPinEntity,
                wallet.getCreatedAt(),
                wallet.getUdaptedAt()
        );
    }

}
