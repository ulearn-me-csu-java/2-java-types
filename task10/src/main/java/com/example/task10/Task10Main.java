package com.example.task10;

public class Task10Main {

    public static boolean compare(float a, float b, int precision) {

        // TODO корректно сравнивать два значения типа float с заданной пользователем точностью (параметр - количество знаков после запятой).
        // Функция должна корректно обрабатывать ситуацию со сравнением значений бесконечности.
        // Функция должна считать значения «не число» NaN (например 0.0/0.0) равными между собой.
        if (Float.isNaN(a) || Float.isNaN(b) || Float.isInfinite(a) || Float.isInfinite(b)) {
            return Float.compare(a, b) == 0;
        }
        double delta = Math.pow(10, -precision);
        if(precision == 0)
        {
            return Math.abs(a - b) <= 0.1;
        }

        return Math.abs(a - b) <= delta;
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
