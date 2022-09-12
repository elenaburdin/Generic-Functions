package com.company;

public class Test {
    static <T> void genericsDisplay(T element) {
        System.out.println(element.getClass().getName() + " = " + element);
    }

    public static void main(String[] args) {
        genericsDisplay(10);
        genericsDisplay("Functions");
        genericsDisplay(22.54);
    }
}
