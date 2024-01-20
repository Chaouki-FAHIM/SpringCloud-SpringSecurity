package com.book.bookservice.config;


import org.springframework.http.HttpStatus;

public class AppException extends RuntimeException{
    private final HttpStatus code;
    public AppException(String message, HttpStatus code) {
   super(message);
   this.code=code;
    }
    public org.springframework.http.HttpStatus getCode(){
        return code;
    }
}
