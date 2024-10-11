package com.bytmasoft.common.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.FORBIDDEN)
public class DSSAccessDeniedExpception extends DSSApplicationException{

    public DSSAccessDeniedExpception() {
        super();
    }

    public DSSAccessDeniedExpception(String message) {
        super(message);
    }

    public DSSAccessDeniedExpception(Exception ex, String message) {
        super(message, ex);
    }

    public DSSAccessDeniedExpception(Exception ex) {
        super(ex);
    }

}
