package com.example.task14;

public class Task14Main {


    public static int reverse(int value) {
        String strvalue = Integer.toString(value);
        String new_int = new StringBuilder(strvalue).reverse().toString();
        return Integer.parseInt(new_int);
    }

    public static void main(String[] args) {
 
        int result = reverse(345);
        System.out.println(result);
    }


}
