package com.example.task14;

public class Task14Main {


    public static int reverse(int value) {

        String str = Integer.toString(value);
        String inverted = new StringBuilder(str).reverse().toString();

        return Integer.parseInt(inverted);
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int result = reverse(345);
        System.out.println(result);
         */
    }


}
