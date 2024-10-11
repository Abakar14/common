package com.bytmasoft.common.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value =  HttpStatus.NOT_FOUND)
public class DSSEntityNotFoundException extends DSSApplicationException{
    /**
     *
     */
    private static final long serialVersionUID = 2893012585063649029L;

    public DSSEntityNotFoundException() {
        super();
    }

    public DSSEntityNotFoundException(String message) {
        super(message);
    }

    public DSSEntityNotFoundException(String message, Exception ex) {
        super(message, ex);
    }


    public DSSEntityNotFoundException(Exception ex) {
        super(ex);
    }



}
