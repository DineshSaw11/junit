package com.junit.junitTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

public class MyIntergerTest {
    @Test
    @Disabled
    public void positiveOrNegativeOne(){
        MyInterger myInterger=new MyInterger();
       String str= myInterger.positiveOrNegative(10);
        String expectedResult="positive";
        Assertions.assertEquals(str,expectedResult);
    }
    @ParameterizedTest
    @ValueSource(ints = {10,9,13,20,22})
    public void positiveOrNegativeTwo(int num){
        MyInterger myInterger=new MyInterger();
        String str= myInterger.positiveOrNegative(num);
        String expectedResult="positive";
        Assertions.assertEquals(str,expectedResult);
    }
    @ParameterizedTest
    @CsvFileSource(resources = "/nums.csv", numLinesToSkip = 1)
    public void positiveOrNegativeThree(int num,String expectedResult){
        MyInterger myInterger=new MyInterger();
        String str= myInterger.positiveOrNegative(num);
        Assertions.assertEquals(str,expectedResult);
    }

}
