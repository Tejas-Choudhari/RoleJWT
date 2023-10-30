package com.example.RoleJWT.exception;

public class CustomException extends RuntimeException{
    private String status;
    private String errorCode;
    private String errorMessage;

    public CustomException(String status, String errorCode, String errorMessage) {
        this.status = status;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public CustomException(String errorMessage) {
        super();
        this.errorMessage = errorMessage;
    }

    public CustomException(String message, String status, String errorCode, String errorMessage) {
        super(message);
        this.status = status;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public CustomException(String message, Throwable cause, String status, String errorCode, String errorMessage) {
        super(message, cause);
        this.status = status;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public CustomException(Throwable cause, String status, String errorCode, String errorMessage) {
        super(cause);
        this.status = status;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public CustomException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, String status, String errorCode, String errorMessage) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.status = status;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }


}
