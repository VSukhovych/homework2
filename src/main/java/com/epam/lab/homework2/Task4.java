package com.epam.lab.homework2;

import java.lang.reflect.Method;

public class Task4 {
    public static void main(String[] args) {
        try {
            Class<?> classOb = Class.forName("com.epam.lab.homework2.Example");
            Method method = classOb.getDeclaredMethod("getInt", int.class);
            System.out.println(method.getName() + " type is " + method.getReturnType().getSimpleName());
            method = classOb.getDeclaredMethod("getDouble", double.class);
            System.out.println(method.getName() + " type is " + method.getReturnType().getSimpleName());
            method = classOb.getDeclaredMethod("getString", String.class);
            System.out.println(method.getName() + " type is " + method.getReturnType().getSimpleName());
        } catch (ClassNotFoundException e) {
            System.out.print("Class not found");
        } catch (NoSuchMethodException e) {
            System.out.print("Method not found");
        }
    }
}
