package com.bytmasoft.common.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.GATEWAY_TIMEOUT)
public class DSSGatewayTimeoutExpception extends DSSApplicationException{

    public DSSGatewayTimeoutExpception() {
        super();
    }

    public DSSGatewayTimeoutExpception(String message) {
        super(message);
    }

    public DSSGatewayTimeoutExpception(Exception ex, String message) {
        super(message, ex);
    }

    public DSSGatewayTimeoutExpception(Exception ex) {
        super(ex);
    }

}
