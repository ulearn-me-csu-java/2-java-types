package com.example.task14;

import java.util.function.IntPredicate;

public class Task14Main {


    public static int reverse(int value) {
        String str=String.valueOf(value);
        String reversed=new StringBuilder(str).reverse().toString();
        return Integer.parseInt(reversed);
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int result = reverse(1240500);
        System.out.println(result);
        */
    }


}
