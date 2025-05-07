package com.junit.junitTest;

public class StringPalidorne {
   public String checkPalidrone(String str){
      // String str="madam";
       StringBuffer strb = new StringBuffer();
       for(int i=str.length()-1;i>=0;i--){
           strb.append(str.charAt(i));
       }
       //System.out.println(strb);
       if(strb.toString().equals(str)){
           return "palidrone";
       }else{
           return "not palidrone";
       }
   }

    public static void main(String[] args) {
        StringPalidorne stringPalidorne=new StringPalidorne();
        String result=stringPalidorne.checkPalidrone("madam");
        System.out.println(result);
    }
}
