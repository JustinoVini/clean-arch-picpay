package br.com.picpay.application.infrastructure.service;

import br.com.picpay.application.core.domain.User;
import br.com.picpay.application.core.domain.Wallet;
import br.com.picpay.application.gateway.CreateUserGateway;
import br.com.picpay.application.infrastructure.mapper.TransactionPinMapper;
import br.com.picpay.application.infrastructure.mapper.UserMapper;
import br.com.picpay.application.infrastructure.mapper.WalletMapper;
import br.com.picpay.application.infrastructure.repository.TransactionPinEntityRepository;
import br.com.picpay.application.infrastructure.repository.UserEntityRepository;
import br.com.picpay.application.infrastructure.repository.WalletEntityRepository;
import org.springframework.stereotype.Service;
import static br.com.picpay.application.infrastructure.utils.Utilities.log;

@Service
public class CreateUserGatewayImpl implements CreateUserGateway {

    private UserEntityRepository userEntityRepository;

    private UserMapper userMapper;

    private TransactionPinEntityRepository transactionPinEntityRepository;

    private TransactionPinMapper transactionPinMapper;

    private WalletEntityRepository walletEntityRepository;

    private WalletMapper walletMapper;

    public CreateUserGatewayImpl(UserEntityRepository userEntityRepository, UserMapper userMapper, TransactionPinEntityRepository transactionPinEntityRepository, TransactionPinMapper transactionPinMapper, WalletEntityRepository walletEntityRepository, WalletMapper walletMapper) {
        this.userEntityRepository = userEntityRepository;
        this.userMapper = userMapper;
        this.transactionPinEntityRepository = transactionPinEntityRepository;
        this.transactionPinMapper = transactionPinMapper;
        this.walletEntityRepository = walletEntityRepository;
        this.walletMapper = walletMapper;
    }

    @Override
    public Boolean create(User user, Wallet wallet) {

        try {
            log.info("Inicio da Criação do Usuário::CreateUserGatewayImpl");
            var userSaved = userEntityRepository.save(userMapper.toUserEntity(user));
            var transactionPinSaved = transactionPinEntityRepository.save(transactionPinMapper.toTransactionPinEntity(wallet.getTransactionPin()));
            walletEntityRepository.save(walletMapper.toWalletEntity(wallet, userSaved, transactionPinSaved));
            log.info("Usuário criado com sucesso::CreateUserGatewayImpl");
            return true;
        } catch (Exception e) {
            log.info("Houve um erro na criação do Usuário::CreateUserGatewayImpl");
            return false;
        }
    }
}
