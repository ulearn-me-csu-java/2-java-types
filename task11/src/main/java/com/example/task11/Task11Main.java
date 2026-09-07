package com.example.task11;

public class Task11Main {

    public static float benefit(float sum, float percent) {
        float TotalPercent = 0f; // Записываю проценты в отдельную переменную, чтобы не потерять значение во время работы с float

        for (int i = 0; i < 12; i++) { // Важно считать от 0, (ошибся и поставил i=1, из-за чего было всего 11 итераций)
            TotalPercent += (sum + TotalPercent) * percent;
        }

        return TotalPercent + sum;
    }

    public static void main(String[] args) {

        float sum = 500; // 500 руб. на счете
        float percent = 0.00000001f; // 0.000001% ежемесячно

        sum = benefit(sum, percent);

        System.out.println("Сумма на счете через год: " + sum);

    }

}
