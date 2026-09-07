package com.example.task14;

public class Task14Main {


    public static int reverse(int value) {

        String tValue = Integer.toString(value);
        String revTValue = new StringBuilder(tValue).reverse().toString();

        int result = Integer.valueOf(revTValue);
        return result;
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
