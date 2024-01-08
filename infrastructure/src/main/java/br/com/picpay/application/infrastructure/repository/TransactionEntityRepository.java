package br.com.picpay.application.infrastructure.repository;

import br.com.picpay.application.infrastructure.entity.TransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionEntityRepository extends JpaRepository<TransactionEntity, Long> {
}
