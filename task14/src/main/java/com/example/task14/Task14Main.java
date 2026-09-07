package com.example.task14;

public class Task14Main {


    public static int reverse(int value) {
        String stroka =  String.valueOf(value);
        String str_value = new StringBuilder(stroka).reverse().toString();

        // TODO напишите здесь код, переставляющий цифры числа в обратном порядке

        return Integer.parseInt(str_value);
    }

    public static void main(String[] args) {

        int result = reverse(345);
        System.out.println(result);
    }


}
