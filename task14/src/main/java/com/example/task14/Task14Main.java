package com.example.task14;

public class Task14Main {

    public static int reverse(int value) {

        String valueStr = String.valueOf(value);

        String reversedStr = new StringBuilder(valueStr).reverse().toString();

        return Integer.parseInt(reversedStr);

    }

    public static void main(String[] args) {

        int result = reverse(345);

        System.out.println(result);

    }
}