package com.ps.labs.rest.exceptions;

public class BusinessException extends Exception {

    private static final long serialVersionUID = -4917715230036338779L;

    public BusinessException(final String message) {
        super(message);
    }

}
