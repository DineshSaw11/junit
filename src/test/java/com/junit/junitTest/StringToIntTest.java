package com.junit.junitTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringToIntTest {
    @Test
    public void convertStringToIntTest(){
        String str=null;
        StringToInt stringToInt=new StringToInt();
        Assertions.assertThrows(IllegalArgumentException.class,()->stringToInt.convertToInt(str));
    }
}
