package com.example.task10;

public class Task10Main {

    public static boolean compare(float a, float b, int precision) {

        if (Double.isInfinite(a) || Double.isInfinite(b)) {return a == b;}
        if (Double.isNaN(a) && Double.isNaN(b)) {return true;}
        if (Double.isNaN(a) || Double.isNaN(b)) {return false;}
        double e = Math.pow(10, -precision);
        double dif = Math.abs(a - b);

        return dif < e;

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
