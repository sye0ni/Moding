package com.ssafy.funding.exception.global;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class DynamicException extends RuntimeException {
    private final String code;
    private final String reason;
}