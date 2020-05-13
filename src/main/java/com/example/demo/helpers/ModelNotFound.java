package com.example.demo.helpers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class ModelNotFound extends RuntimeException{
    public ModelNotFound(String message)
    {
        super(message);
    }
}