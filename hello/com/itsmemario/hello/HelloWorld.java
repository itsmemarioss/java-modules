package com.itsmemario.hello;

import javax.swing.JOptionPane;
import com.itsmemario.greet.Greeter;

public class HelloWorld {
    public static void main(String... args) {
        String hello = Greeter.newInstance().greet("modular world!");

        System.out.println(hello);
        JOptionPane.showMessageDialog(null, hello);
    }
}