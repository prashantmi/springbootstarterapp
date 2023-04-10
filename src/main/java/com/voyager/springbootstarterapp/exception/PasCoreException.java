package com.voyager.springbootstarterapp.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

public class PasCoreException extends Exception {

    private static final long serialVersionUID = 8146124648181104043L;

    private PasExceptionType pasExceptionType;

    private StackTraceElement[] trace;

    private transient LocalDateTime timestamp;
    
    private HttpStatus httpStatus;

    public PasCoreException() {
    	super();
        this.pasExceptionType = pasExceptionType;
        this.trace = trace;
        this.timestamp = LocalDateTime.now(); 
    }
    
    public PasCoreException(PasExceptionType pasExceptionType, StackTraceElement[] trace) {
        super(pasExceptionType.getReason());
        this.pasExceptionType = pasExceptionType;
        this.trace = trace;
        this.timestamp = LocalDateTime.now();

    }
    
    public PasCoreException(String customMessage, PasExceptionType pasExceptionType, StackTraceElement[] trace) {
        super(customMessage);
        this.pasExceptionType = pasExceptionType;
        this.trace = trace;
        this.timestamp = LocalDateTime.now();

    }

    public PasCoreException(String customMessage, PasExceptionType pasExceptionType) {
        super(customMessage);
        this.pasExceptionType = pasExceptionType;
        this.timestamp = LocalDateTime.now();

    }

    public StackTraceElement[] getTrace() {
        return this.trace;
    }

    public void setTrace(StackTraceElement[] trace) {
        this.trace = trace;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    public PasExceptionType getPasExceptionType() {
        return pasExceptionType;
    }

    public void setPasExceptionType(PasExceptionType pasExceptionType) {
        this.pasExceptionType = pasExceptionType;
    }


}
