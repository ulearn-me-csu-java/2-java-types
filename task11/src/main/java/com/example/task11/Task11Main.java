package com.example.task11;

public class Task11Main {

    public static float benefit(float sum, float percent) {
        float comp = 0.0f;
        for (int i = 0; i < 12; i++) {
            float delta = sum * percent - comp;
            float t = sum + delta;
            comp = (t - sum) - delta;
            sum = t;
        }
        return sum;
    }

    public static void main(String[] args) {

        float sum = 500; // 500 руб. на счете
        float percent = 0.00000001f; // 0.000001% ежемесячно

        sum = benefit(sum, percent);

        System.out.println("Сумма на счете через год: " + sum);

    }

}
