package com.fullStackProjectBackend.berkay;

import lombok.Data;

@Data
public class ErrorResponse {
    private int code;
    private String message;
}
