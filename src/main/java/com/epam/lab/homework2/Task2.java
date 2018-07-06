package com.epam.lab.homework2;

import java.lang.reflect.Field;

public class Task2 {
    public static void main(String[] args) {
        Example exampleOb = new Example();
        Class<?> classOb = exampleOb.getClass();
        Field[] fields = classOb.getDeclaredFields();
        System.out.println("Fields with SimpleAnnotation:");
        for (Field field : fields) {
            if (field.isAnnotationPresent(SimpleAnnotation.class))
                System.out.println(field.getName());
        }
    }
}