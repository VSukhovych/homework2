package com.epam.lab.homework2;

@SimpleAnnotation
class Example {
    @SimpleAnnotation("1st Field SimpleAnnotation")
    int value1;
    double value2;
    @SimpleAnnotation("2nd Field SimpleAnnotation")
    String value3;

    Example() {
        value1 = 1;
        value2 = 2.0;
        value3 = "three";
    }

    int getInt(int val) {
        return val;
    }

    double getDouble(double val) {
        return val;
    }

    String getString(String val) {
        return val;
    }

    void varargsMeth(String str, int... args) {
        System.out.println("Invoked varargsMeth(String str, int... args)");
    }

    void varargsMeth(String... args) {
        System.out.println("Invoked varargsMeth(String... args)");
    }
}
