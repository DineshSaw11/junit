package com.junit.execption;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AllExceptionHandler {
    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> GlobalExceptionHandler(Exception ex){
        ErrorResponse errorResponse=new ErrorResponse(ex.getMessage(), ex.getCause(),HttpStatus.BAD_REQUEST);
        return ResponseEntity.ok(ex);
    }
    @ExceptionHandler(DuplicateDepartment.class)
    public ResponseEntity<Object> handleDuplicateDepartment(DuplicateDepartment duplicateDepartment){
        ErrorResponse errorResponse=new ErrorResponse(duplicateDepartment.getMessage(), duplicateDepartment.getCause()
        , HttpStatus.CONFLICT);
        return new ResponseEntity<>(errorResponse,HttpStatus.CONFLICT);
    }
}
