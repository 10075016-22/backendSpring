package com.example.demo.helpers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class AlreadyExistRegister extends RuntimeException {
    public AlreadyExistRegister(String message)
    {
        super(message);
    }
}