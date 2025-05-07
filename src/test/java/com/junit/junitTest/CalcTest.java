package com.junit.junitTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalcTest {
    @Test
    public void testSumOne(){
        Calc calc=new Calc();
        int actualResult=calc.sum(20,30);
        int expectedResult=50;
        Assertions.assertEquals(actualResult,expectedResult);

    }
    @Test
    public void testSumTwo(){
        Calc calc=new Calc();
        int actualResult=calc.sum(20,30);
        int expectedResult=30;
        Assertions.assertNotEquals(actualResult,expectedResult);

    }
    private static Stream<Arguments> provideNumbersForAddition() {
        return Stream.of(
                Arguments.of(1, 2, 3),  // a + b = 3
                Arguments.of(4, 5, 9),  // a + b = 9
                Arguments.of(-1, -1, -2), // a + b = -2
                Arguments.of(0, 0, 0)  // a + b = 0
        );
    }
    @ParameterizedTest
    @MethodSource("provideNumbersForAddition")  // Refers to the method supplying data
    public void testAdd(int a, int b, int expected) {
        Calc calc=new Calc();
        int result = calc.sum(a, b);
        Assertions.assertEquals(expected, result);
    }

    @RepeatedTest(5)
    public void testSumThree(){
        Calc calc=new Calc();
        int actualResult=calc.sum(20,30);
        int expectedResult=30;
        Assertions.assertNotEquals(actualResult,expectedResult);

    }

}
