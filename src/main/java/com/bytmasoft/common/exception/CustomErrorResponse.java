package com.bytmasoft.common.exception;
import lombok.AllArgsConstructor;
import lombok.Builder;

import java.time.LocalDateTime;

@Builder
@AllArgsConstructor
public class CustomErrorResponse {

    private LocalDateTime timestamp = LocalDateTime.now();
    private int status;
    private String error;
    private String message;
}
