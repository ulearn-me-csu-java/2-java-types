package com.example.task10;

public class Task10Main {

    public static boolean compare(float a, float b, int precision) {


        if (Float.isNaN(a) && Float.isNaN(b)) {
            return true;
        }
        if (Float.isNaN(a) || Float.isNaN(b)) {
            return false;
        }

        if (Float.isInfinite(a) && Float.isInfinite(b)) {
            return a == b;
        }
        if (Float.isInfinite(a) || Float.isInfinite(b)) {
            return false;
        }

        long  scale = (long)Math.pow(10, precision);
        long aScaled = (long)(a * scale);
        long bScaled = (long)(b * scale);
        return aScaled == bScaled;
    }

    public static void main(String[] args) {
//        float a = 0.3f;
//        float b = 0.4f;
//        float sum = a + b;
//        float c = 0.7f;
//
////        boolean result = compare(sum, c, 2);
        boolean result = compare(0.7f, 0.3f+0.4f, 2);
        System.out.println(result);
//
//
//
//

        System.out.println(0.7f*100);


    }

}
