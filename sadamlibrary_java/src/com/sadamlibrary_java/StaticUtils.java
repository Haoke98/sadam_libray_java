package com.sadamlibrary_java;

public class StaticUtils {

    public static String getCodeInfo(Throwable throwable){
        String s = "";
        for (StackTraceElement stackTraceElement:throwable.getStackTrace()){
            s+=stackTraceElement.toString()+"\n";
        }
        return s+":";
    }
}
