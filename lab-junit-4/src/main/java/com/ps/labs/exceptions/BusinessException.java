package com.ps.labs.exceptions;

public class BusinessException extends Exception {

    private static final long serialVersionUID = -1521343772507290737L;

    public BusinessException(final String message) {
        super(message);
    }

    public BusinessException(final String message, final Throwable cause) {
        super(message, cause);
    }

}
