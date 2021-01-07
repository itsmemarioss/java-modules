package com.itsmemario.greet.internal;

import  com.itsmemario.greet.*;

public class GreeterImpl implements Greeter {
    public String greet(String name){
        return "hello "+name;
    }
}