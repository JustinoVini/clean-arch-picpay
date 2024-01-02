package br.com.picpay.application.repository;

import br.com.picpay.application.entity.TransactionPinEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionPinEntityRepository extends JpaRepository<TransactionPinEntity, Long> {
}
