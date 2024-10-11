package com.bytmasoft.common.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.SERVICE_UNAVAILABLE)
public class DSSServiceUnavailableExpception extends DSSApplicationException{

    /**
     *
     */
    private static final long serialVersionUID = -2186268435454707678L;


    public DSSServiceUnavailableExpception() {
        super();
    }

    public DSSServiceUnavailableExpception(String message) {
        super(message);
    }

    public DSSServiceUnavailableExpception(Exception ex, String message) {
        super(message, ex);
    }

    public DSSServiceUnavailableExpception(Exception ex) {
        super(ex);
    }
}
