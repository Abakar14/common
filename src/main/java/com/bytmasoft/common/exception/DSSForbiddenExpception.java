package com.bytmasoft.common.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.FORBIDDEN)
public class DSSForbiddenExpception extends DSSApplicationException{

    public DSSForbiddenExpception() {
        super();
    }

    public DSSForbiddenExpception(String message) {
        super(message);
    }

    public DSSForbiddenExpception(Exception ex, String message) {
        super(message, ex);
    }

    public DSSForbiddenExpception(Exception ex) {
        super(ex);
    }

}
