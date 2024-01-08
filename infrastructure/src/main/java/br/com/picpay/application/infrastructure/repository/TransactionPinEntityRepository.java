package br.com.picpay.application.infrastructure.repository;

import br.com.picpay.application.infrastructure.entity.TransactionPinEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionPinEntityRepository extends JpaRepository<TransactionPinEntity, Long> {
}
