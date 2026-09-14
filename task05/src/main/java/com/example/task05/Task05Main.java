package com.example.task05;

public class Task05Main {

    public static String solution(int x) {

        if (x == 0) {
            return "TRUE";
        }

        while (x > 0) {
            int lastPartOfNumber = x % 10;

            if (lastPartOfNumber % 2 != 0) {
                return "FALSE";
            }
            x /= 10;
        }
        return "TRUE";
    }

    public static void main(String[] args) {

        String result = solution(1234);
        System.out.println(result);

    }

}
