package com.example.task11;

public class Task11Main {

    public static float benefit(float sum, float percent) {
        float totalPercent = 0.0f;
        float currentFactor = 1.0f;

        for (int i = 1; i <= 12; i++) {
            totalPercent += currentFactor * percent;
            currentFactor += currentFactor * percent;
        }

        return sum + sum * totalPercent;
    }

    public static void main(String[] args) {
        float sum = 500;
        float percent = 0.00000001f;

        sum = benefit(sum, percent);

        System.out.println("Сумма на счете через год: " + sum);
    }

}
