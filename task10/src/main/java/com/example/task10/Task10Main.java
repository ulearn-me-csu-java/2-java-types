package com.example.task10;

public class Task10Main {

    public static boolean compare(float a, float b, int precision) {
        //если оба NaN то выводим true
        if (Float.isNaN(a) && Float.isNaN(b)) {
            return true;
        }
        //если только одно из них false
        if (Float.isNaN(a) || Float.isNaN(b)) {
            return false;
        }
        // сли есть бесконечность сравниваем напрямую
        if (Float.isInfinite(a) || Float.isInfinite(b)) {
            return a == b;
        }
        // для чисел находим  разницу и погрешность
        double razn = Math.abs(a-b);
        double pogr = Math.pow(10,-precision);
        return razn < pogr;
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
