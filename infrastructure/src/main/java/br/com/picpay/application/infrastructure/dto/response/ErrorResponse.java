package br.com.picpay.application.infrastructure.dto.response;

import java.util.List;

public record ErrorResponse(String code, String message, List<ValiditionError> validitions) {}
