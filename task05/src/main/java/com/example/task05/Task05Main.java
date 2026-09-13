package com.example.task05;

public class Task05Main {

    public static String solution(int x) {
        while (x > 0) {
            int lastDigit = x % 10;
            if (lastDigit % 2 != 0) return "FALSE";
            x /= 10;
        }

        return "TRUE";
    }

    public static void main(String[] args) {
        String result = solution(1234);
        System.out.println(result);
    }

}
