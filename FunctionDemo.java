package com.edu;

import java.util.function.*;
class FunctionDemo{
     public static void main(String args[]){
            //create a function reference to lambda expression
           //to find the length of a string

           Function<String,Integer>len=(str)->str.length();
      //find the length of a string str
           String str="Edubridge Education";
           System.out.println("Length="+len.apply(str));
     }
}
