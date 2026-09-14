package com.example.task14;

public class Task14Main {


    public static int reverse(int value) {

        String intToStr = Integer.toString(value);
        String reverseWord = new StringBuilder(intToStr).reverse().toString();

        return Integer.parseInt(reverseWord);
    }

    public static void main(String[] args) {
        int result = reverse(345);
        System.out.println(result);
    }


}
