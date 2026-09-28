package com.example.task09;

public class Task09Main {

    public static double solution() {
        // TODO Устраните ошибку вычисления выражения, не изменяя типы данных у переменных

        float a = 1.0f;
        float b = 3.0f;
        float c = 1.0e9f;
        double x = (a / b - 1.0f / 3.0f) * c;

        return x;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение
        /*
        System.out.println(solution() == 0.0d);
        */
    }

}
