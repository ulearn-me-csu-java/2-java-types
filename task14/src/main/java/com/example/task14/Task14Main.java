package com.example.task14;

public class Task14Main {


    public static int reverse(int value) {
        String text = String.valueOf(value);
        String reversed = new StringBuilder(text).reverse().toString();

        return Integer.parseInt(reversed);
    }
}
