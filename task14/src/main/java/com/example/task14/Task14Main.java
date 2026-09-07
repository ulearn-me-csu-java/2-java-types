package com.example.task14;

public class Task14Main {


    public static int reverse(int value) {
        String str = Integer.toString(value);
        String reverseStr = new StringBuilder(str).reverse().toString();

        return Integer.parseInt(reverseStr);
    }

    public static void main(String[] args) {
        int result = reverse(345);
        System.out.println(result);
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int result = reverse(345);
        System.out.println(result);
         */
    }


}
