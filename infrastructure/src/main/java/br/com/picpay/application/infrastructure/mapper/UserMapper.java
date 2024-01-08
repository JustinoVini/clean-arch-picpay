package br.com.picpay.application.infrastructure.mapper;

import br.com.picpay.application.core.domain.TaxNumber;
import br.com.picpay.application.core.domain.User;
import br.com.picpay.application.infrastructure.dto.request.CreateUserRequest;
import br.com.picpay.application.infrastructure.entity.UserEntity;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public UserEntity toUserEntity(User user){
        return new UserEntity(
                user.getId(),
                user.getEmail(),
                user.getPassword(),
                user.getTaxNumber().getValue(),
                user.getFullname(),
                user.getType(),
                user.getCreatedAt(),
                user.getUdaptedAt()
        );
    }

    public User toUser(CreateUserRequest request) throws Exception {
        return new User(
                request.email(),
                request.password(),
                new TaxNumber(request.taxNumber()),
                request.fullname(),
                request.type()
        );
    }
}
