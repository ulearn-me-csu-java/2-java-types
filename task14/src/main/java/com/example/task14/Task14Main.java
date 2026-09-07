package com.example.task14;

public class Task14Main {


    public static int reverse(int value) {

        // TODO напишите здесь код, переставляющий цифры числа в обратном порядке
        String num = Integer.toString(value);
        StringBuilder number = new StringBuilder(num).reverse();
        String res = number.toString();
        return Integer.parseInt(res);
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int result = reverse(345);
        System.out.println(result);

    }


}
