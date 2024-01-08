package br.com.picpay.application.infrastructure.repository;

import br.com.picpay.application.infrastructure.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserEntityRepository extends JpaRepository<UserEntity, String> {

    Boolean existsByTaxNumber(String taxNumber);

    Boolean existsByEmail(String email);
}
