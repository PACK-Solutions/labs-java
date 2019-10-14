package com.ps.labs.exceptions;

public class BusinessException extends Exception {
 
    private static final long serialVersionUID = 2249567116944311341L;

    public BusinessException(String message) {
        super(message);
    }
 
    public BusinessException(String message, Throwable cause) {
        super(message, cause);
    }

}
