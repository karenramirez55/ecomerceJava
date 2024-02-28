package com.example.demoJPA.controllers;

import com.example.demoJPA.models.Clientes;
import lombok.Getter;
import org.apache.commons.lang3.ObjectUtils;

public class LogsMessage {
    private String message;
    private String errorCode;


    public LogsMessage(String message, String errorCode) {
        this.message = message;
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}
