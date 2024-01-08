package br.com.picpay.application.infrastructure.dto.request;

import br.com.picpay.application.core.domain.enums.UserTypeEnum;

public record CreateUserRequest(String email, String password, String taxNumber, String fullname, UserTypeEnum type, String pin) {
}
