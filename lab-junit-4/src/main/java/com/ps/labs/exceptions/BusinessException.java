package com.ps.labs.exceptions;

public class BusinessException extends Exception {
 
    private static final long serialVersionUID = -1114985309437458227L;

    public BusinessException(final String message) {
        super(message);
    }

}
