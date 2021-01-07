package com.itsmemario.greet;

public interface Greeter {

    static Greeter newInstance(){
        return new com.itsmemario.greet.internal.GreeterImpl();
    }

    String greet(String name);
}