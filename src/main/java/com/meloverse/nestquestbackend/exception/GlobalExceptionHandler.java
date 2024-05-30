package com.meloverse.nestquestbackend.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler({ResourceNotFoundException.class})
    public ResponseEntity<Object> handleException(ResourceNotFoundException e) {
        log.error("ResourceNotFoundException", e);
        var error = new ErrorResponse(NOT_FOUND, "Resource is not found");
        return ResponseEntity.status(NOT_FOUND).body(error);
    }
}