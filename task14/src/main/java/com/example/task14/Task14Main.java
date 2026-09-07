package com.example.task14;

public class Task14Main {
    public static int reverse(int value) {
        long result = 0;
        while (value > 0) {
            result = result * 10 + value % 10;
            value /= 10;
        }
        return (int) result;
    }

    public static void main(String[] args) {
        int result = reverse(234567);
        System.out.println(result);
    }
}
