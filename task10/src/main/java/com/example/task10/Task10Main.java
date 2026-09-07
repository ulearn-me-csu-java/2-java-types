package com.example.task10;

public class Task10Main {

    public static boolean compare(float a, float b, int precision) {
        if (Float.isNaN(a) && Float.isNaN(b)) {
            return true;
        }

        if (Float.isInfinite(a) || Float.isInfinite(b)) {
            return a == b;
        }


        // TODO корректно сравнивать два значения типа float с заданной пользователем точностью (параметр - количество знаков после запятой).
        // Функция должна корректно обрабатывать ситуацию со сравнением значений бесконечности.
        // Функция должна считать значения «не число» NaN (например 0.0/0.0) равными между собой.
        double epsilon = Math.pow(10, -precision);
        double diff = Math.abs((double) a - (double) b); // сравниваю расстаяние между двумя числами с порогом precision, если меньше - значит числа равны

        return diff < epsilon;
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
