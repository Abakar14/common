package com.bytmasoft.common.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class StorageFileNotFoundException extends DSSApplicationException {
    private static final long serialVersionUID = 1L;

    public StorageFileNotFoundException() {
        super() ;
    }

    public StorageFileNotFoundException(String s) {
        super(s);

    }

    public StorageFileNotFoundException(Exception ex) {
        super(ex);

    }


    public StorageFileNotFoundException(String s, Exception ex) {
        super(s, ex);
    }
}
