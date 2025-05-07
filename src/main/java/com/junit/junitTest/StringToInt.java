package com.junit.junitTest;

public class StringToInt {
    public Integer convertToInt(String str){
        if(str==null || str.length()==0){
            throw new IllegalArgumentException("string must not be null or empty");
        }else{
            return Integer.valueOf(str);
        }
    }
}
