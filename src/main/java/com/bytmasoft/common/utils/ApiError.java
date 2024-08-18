package com.bytmasoft.common.utils;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

//@XmlRootElement
@AllArgsConstructor
@Data
public class ApiError {

    private LocalDateTime now;
    private String message;
    private String description;
    private int status;

}