package com.example.task14;

public class Task14Main {


    public static int reverse(int value) {
        String valueAsString = String.valueOf(value);
        String reversed = new StringBuilder(valueAsString).reverse().toString();
        int result = Integer.parseInt(reversed);
        return result;
    }

    public static void main(String[] args) {

        int result = reverse(345);
        System.out.println(result);

    }


}
