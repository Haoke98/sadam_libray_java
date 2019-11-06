package com.sadamlibrary_java;

public class MyObject extends Object{
//     public static void main(String[] args){

//          myLog("good to see you again.");
//     }
     public static void myLog(String log_message){
          System.out.println(StaticUtils.getCodeInfo(new Throwable())+log_message);
     }
}
