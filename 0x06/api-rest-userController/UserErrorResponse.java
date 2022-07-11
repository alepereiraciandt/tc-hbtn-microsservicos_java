package com.example.user.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

public class UserErrorResponse {
    private String message;
    private int status;

    public UserErrorResponse() {

    }

    public UserErrorResponse(String message, int status) {
        this.message = message;
        this.status = status;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public int getStatus() {
        return status;
    }
}
