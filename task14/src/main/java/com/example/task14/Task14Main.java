package com.example.task14;

public class Task14Main {


    public static int reverse(int value) {

        String number = Integer.toString(value);
        String rev_number = new StringBuilder(number).reverse().toString();
        return Integer.parseInt(rev_number);
    }

    public static void main(String[] args) {

        int result = reverse(345112);
        System.out.println(result);

    }


}
