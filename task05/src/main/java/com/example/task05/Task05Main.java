package com.example.task05;

public class Task05Main {

    public static String solution(int x) {
        if (x == 0) {
            return "TRUE";
        }

        while (x > 0) {
            int digit = x % 10;

            if (digit % 2 != 0) {
                return "FALSE";
            }

            x /= 10;
        }

        return "TRUE";
    }
}
