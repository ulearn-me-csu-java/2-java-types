package com.example.task10;

public class Task10Main {

    public static boolean compare(float a, float b, int precision) {
        if (Float.isNaN(a) && Float.isNaN(b)) {
            return true;
        }

        if (Float.isNaN(a) || Float.isNaN(b)) {
            return false;
        }

        if (a == b) {
            return true;
        }

        if (Float.isInfinite(a) || Float.isInfinite(b)) {
            return false;
        }

        double accuracy = Math.pow(10, -precision);

        return Math.abs(a - b) < accuracy;
    }
}
