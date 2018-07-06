package com.epam.lab.homework2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class task7 {
    public static void main(String[] args) {
        Class<?> classOb = Example.class;
        getClassInfo(classOb);
    }

    private static void getClassInfo(Class<?> classOb) {
        System.out.println("Class info:\n");
        System.out.println("Class name: " + classOb.getSimpleName());
        System.out.println("Class package: " + classOb.getPackage());
        System.out.println("Superclass: " + classOb.getSuperclass().getSimpleName());
        Class[] interfaces = classOb.getInterfaces();
        System.out.println("\nImplemented interfaces:");
        for (Class each : interfaces)
            System.out.println(each.getSimpleName());
        Constructor[] constructors = classOb.getDeclaredConstructors();
        System.out.println("\nConstructors:");
        for (Constructor each : constructors)
            System.out.println(each);
        Method[] methods = classOb.getDeclaredMethods();
        System.out.println("\nMethods:");
        for (Method each : methods)
            System.out.println(each.getName());
        Field[] fields = classOb.getDeclaredFields();
        System.out.println("\nFields:");
        for (Field each : fields)
            System.out.println(each);
        Annotation[] annotations = classOb.getAnnotations();
        System.out.println("\nAnnotations:");
        for (Annotation each : annotations)
            System.out.println(each);
    }
}