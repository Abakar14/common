package com.bytmasoft.common.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NO_CONTENT)
public class DSSNoContentExpception extends DSSApplicationException{

    public DSSNoContentExpception() {
        super();
    }

    public DSSNoContentExpception(String message) {
        super(message);
    }

    public DSSNoContentExpception(Exception ex, String message) {
        super(message, ex);
    }

    public DSSNoContentExpception(Exception ex) {
        super(ex);
    }

}
