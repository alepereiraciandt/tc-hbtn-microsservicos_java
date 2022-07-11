package com.example.user.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionService {
    @ExceptionHandler
    ResponseEntity<Exception> handleException(Exception err){
        UserErrorResponse userErrorResponse = new UserErrorResponse(err.getMessage(), HttpStatus.NOT_FOUND.value());
        return new ResponseEntity(userErrorResponse, HttpStatus.NOT_FOUND);
    }
}
