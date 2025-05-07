package com.junit.execption;

public class DuplicateDepartment extends  RuntimeException{
    public DuplicateDepartment(String message) {
        super(message);
    }

    public DuplicateDepartment(String message, Throwable cause) {
        super(message, cause);
    }
}
