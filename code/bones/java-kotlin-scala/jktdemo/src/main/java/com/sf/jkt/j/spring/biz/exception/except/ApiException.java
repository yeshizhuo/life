package com.sf.jkt.j.spring.biz.exception.except;

public class ApiException extends RuntimeException {
    private int code;
    private String message;

    public ApiException(int code,String message){
        this.code=code;
        this.message=message;
    }
}
