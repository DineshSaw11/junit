package com.junit.junitTest;

import org.junit.jupiter.api.*;

public class StringPalidroneTest {
   private static StringPalidorne stringPalidorne;
   private static StringPalidroneTest stringPalidroneTest;
    public void beforeMessage(){
        System.out.println("test start");
    }
    public void AfterMessage(){
        System.out.println("test end");
    }
    @BeforeAll
    public static void init(){
        stringPalidorne=new StringPalidorne();
        stringPalidroneTest=new StringPalidroneTest();
    }
    @AfterAll
    public static void destroy(){
        stringPalidorne=null;
        stringPalidroneTest=null;
    }
    @BeforeEach
    public void before(){
       // StringPalidroneTest stringPalidroneTest=new StringPalidroneTest();
        stringPalidroneTest.beforeMessage();
    }
    @AfterEach
    public void after(){
       // StringPalidroneTest stringPalidroneTest=new StringPalidroneTest();
        stringPalidroneTest.AfterMessage();
    }
    @Test
    public void checkPalidroneTestOne(){
        String str="madam";
        //StringPalidorne stringPalidorne=new StringPalidorne();
        String result=stringPalidorne.checkPalidrone(str);
        String expectedResult="palidrone";
        Assertions.assertEquals(result,expectedResult);
    }
    @Test
    public void checkPalidroneTestTwo(){
        String str="dinesh";
       // StringPalidorne stringPalidorne=new StringPalidorne();
        String result=stringPalidorne.checkPalidrone(str);
        String expectedResult="not palidrone";
        Assertions.assertEquals(result,expectedResult);
    }

}
