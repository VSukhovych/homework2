package com.epam.lab.homework2;

import java.lang.reflect.Method;

public class Task6 {
    public static void main(String[] args) {
        Example exampleOb = new Example();
        try {
            Class<?> classOb = exampleOb.getClass();
            Method method = classOb.getDeclaredMethod("varargsMeth", String.class, int[].class);
            System.out.println(method);//print varargsMeth(String str, int... args)
            method = classOb.getDeclaredMethod("varargsMeth", String[].class);
            System.out.println(method);//print varargsMeth(String... args)
        } catch (NoSuchMethodException e) {
            System.out.println("Method not found");
        }
    }
}
