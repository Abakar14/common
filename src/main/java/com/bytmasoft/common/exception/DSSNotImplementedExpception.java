package com.bytmasoft.common.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_IMPLEMENTED)
public class DSSNotImplementedExpception extends DSSApplicationException{

    /**
     *
     */
    private static final long serialVersionUID = -2186268435454707678L;


    public DSSNotImplementedExpception() {
        super();
    }

    public DSSNotImplementedExpception(String message) {
        super(message);
    }

    public DSSNotImplementedExpception(Exception ex, String message) {
        super(message, ex);
    }

    public DSSNotImplementedExpception(Exception ex) {
        super(ex);
    }
}
