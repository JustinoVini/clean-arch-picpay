package br.com.picpay.application.infrastructure.repository;

import br.com.picpay.application.infrastructure.entity.WalletEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WalletEntityRepository extends JpaRepository<WalletEntity, Long> {
}
