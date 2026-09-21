package com.example.task10;

public class Task10Main {

    public static boolean compare(float a, float b, int precision) {

        if (Float.isNaN(a) && Float.isNaN(b)) {
            return true;
        }

        if (Float.isNaN(a) || Float.isNaN(b)) {
            return false;
        }

        if (Float.isInfinite(a) || Float.isInfinite(b)) {
            return a == b;
        }

        float epsilon = (float) Math.pow(10, -precision);

        return Math.abs(a - b) < epsilon;

    }

    public static void main(String[] args) {

        System.out.println(compare(100.001f,100.009f,2));

    }

}
