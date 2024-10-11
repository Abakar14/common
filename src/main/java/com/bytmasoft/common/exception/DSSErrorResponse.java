package com.bytmasoft.common.exception;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
public class DSSErrorResponse {

    private LocalDateTime timestamp = LocalDateTime.now();
    private int statusCode;
    private String errorCode;
    private String message;



}
