package com.example.task10;

public class Task10Main {

    public static boolean compare(float a, float b, int precision) {
        if (Float.isNaN(a) && Float.isNaN(b))
            return true;

        if (Float.isNaN(a) || Float.isNaN(b))
            return false;

        if (Float.isInfinite(a) || Float.isInfinite(b))
            return a == b;

        if (precision == 0)
            return Math.round(a) == Math.round(b);

        double epsilon = Math.pow(10, -precision);
        return Math.abs(a - b) <= epsilon;
    }

    public static void main(String[] args) {
        float a = 0.3f;
        float b = 0.4f;
        float sum = a + b;
        float c = 0.7f;

        boolean result = compare(sum, c, 2);
        System.out.println(result);

    }

}
