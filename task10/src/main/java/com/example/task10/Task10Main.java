package com.example.task10;

public class Task10Main {

    public static boolean compare(float a, float b, int precision) {

        double epsilon = Math.pow(10, -precision);
        // TODO корректно сравнивать два значения типа float с заданной пользователем точностью (параметр - количество знаков после запятой).

        if (Math.abs(a - b) < epsilon) {
            return true;
        } else if (Double.isNaN(a) && Double.isNaN(b)) {
            return true;
        } else if (a == 1.0/0.0 && b == 1.0/0.0) {
            return true;
        } else if (a == -1.0/0.0 && b == -1.0/0.0) {
            return true;
        } else {
            return false;
        }

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
