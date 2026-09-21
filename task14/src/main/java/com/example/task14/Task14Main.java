package com.example.task14;

public class Task14Main {


    public static int reverse(int value) {

        String reversed = new StringBuilder(String.valueOf(value))
                .reverse()
                .toString();

        return Integer.parseInt(reversed);
    }

    public static void main(String[] args) {
        int result = reverse(345);
        System.out.println(result);
    }


}
