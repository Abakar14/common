package com.bytmasoft.common.exception;

public class DSSApplicationException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public DSSApplicationException(String message) {
        super(message);
    }

    public DSSApplicationException() {
        super();
    }

    public DSSApplicationException(String message, Exception ex) {
        super(message, ex);
    }

    public DSSApplicationException(Exception ex) {
        super(ex);
    }
}
