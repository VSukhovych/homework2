package com.epam.lab.homework2;

import java.lang.reflect.Field;

public class Task3 {
    public static void main(String[] args) {
        Example example = new Example();
        try {
            Class<?> classOb = example.getClass();
            Field field = classOb.getDeclaredField("value1");
            SimpleAnnotation annotation = field.getAnnotation(SimpleAnnotation.class);
            System.out.println("Annotation value: " + annotation.value());
        } catch (NoSuchFieldException e) {
            System.out.println("Field not found");
        }
    }
}
