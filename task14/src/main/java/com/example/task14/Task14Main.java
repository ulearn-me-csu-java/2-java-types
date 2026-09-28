package com.example.task14;

public class Task14Main {

    public static int reverse(int value) {
        int result = 0;
        while (value != 0) {
            result = result * 10 + value % 10;
            value /= 10;
        }
        return result;
    }

    public static void main(String[] args) {
        int result = reverse(345);
        System.out.println(result);
    }
}
