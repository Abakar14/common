package com.bytmasoft.common.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class StorageException extends DSSApplicationException {

    public StorageException() {
        super();
    }

    public StorageException(Exception ex) {
        super(ex);
    }

    public StorageException(String message) {
        super(message);
    }

    public StorageException(String message, Exception ex) {
        super(message, ex);
    }





}
