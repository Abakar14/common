package com.bytmasoft.common.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.UNAUTHORIZED)
public class DSSUnauthorizedExpception extends DSSApplicationException{

    public DSSUnauthorizedExpception() {
        super();
    }

    public DSSUnauthorizedExpception(String message) {
        super(message);
    }

    public DSSUnauthorizedExpception(Exception ex, String message) {
        super(message, ex);
    }

    public DSSUnauthorizedExpception(Exception ex) {
        super(ex);
    }

}
