package com.project.bootcamp.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ExceptionsHandler extends ResponseEntityExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(BusinessExceptons.class)
    @ExceptionHandler(BusinessExceptons.class)
    protected ResponseEntity<ExceptionResponse> handleSecurity(BusinessExceptons e){
        return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).body(new ExceptionResponse(e.getMessage)));
    }

    @ExceptionHandler(NotFoundException.class)
    protected ResponseEntity<NotFoundException> handleSecurity(BusinessExceptons e){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ExceptionResponse(e.getMessage)));
    }
}
