package com.bytmasoft.common.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.METHOD_NOT_ALLOWED)
public class DSSMethodNotAllowedExpception extends DSSApplicationException{

    public DSSMethodNotAllowedExpception() {
        super();
    }

    public DSSMethodNotAllowedExpception(String message) {
        super(message);
    }

    public DSSMethodNotAllowedExpception(Exception ex, String message) {
        super(message, ex);
    }

    public DSSMethodNotAllowedExpception(Exception ex) {
        super(ex);
    }

}
