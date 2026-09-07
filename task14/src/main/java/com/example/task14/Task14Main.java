package com.example.task14;

public class Task14Main {


    public static int reverse(int value) {
        String valueString = Integer.toString(value);
        String reversedValueString = new StringBuilder(valueString).reverse().toString();
        return Integer.parseInt(reversedValueString);
    }

    public static void main(String[] args) {
        int result = reverse(345);
        System.out.println(result);
    }


}
