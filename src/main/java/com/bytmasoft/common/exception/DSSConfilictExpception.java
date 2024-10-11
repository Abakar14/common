package com.bytmasoft.common.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class DSSConfilictExpception extends DSSApplicationException{

    public DSSConfilictExpception() {
        super();
    }

    public DSSConfilictExpception(String message) {
        super(message);
    }

    public DSSConfilictExpception(Exception ex, String message) {
        super(message, ex);
    }

    public DSSConfilictExpception(Exception ex) {
        super(ex);
    }

}
