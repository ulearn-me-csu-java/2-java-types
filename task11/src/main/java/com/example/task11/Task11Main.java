package com.example.task11;

import java.math.BigDecimal;

public class Task11Main {

    public static float benefit(float sum, float percent) {

        // TODO исправьте функцию, чтобы избежать накопления ошибки
        float total = 0.0f;
        float current = sum;
        for (int i = 1; i <= 12; i++) {
            float add = current * percent;
            total += add;
            current += add;
        }
        return sum + total;
    }

    public static void main(String[] args) {

        float sum = 500; // 500 руб. на счете
        float percent = 0.00000001f; // 0.000001% ежемесячно

        sum = benefit(sum, percent);

        System.out.println("Сумма на счете через год: " + sum);

    }

}
