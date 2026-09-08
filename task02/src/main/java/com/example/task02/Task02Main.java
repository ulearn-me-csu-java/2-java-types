package com.example.task02;

public class Task02Main {

    public static String solution(String input) {

        long number = Long.parseLong(input);
        if (number <= Byte.MAX_VALUE && Byte.MIN_VALUE <= number) {return "byte";}
        else if (number <= Short.MAX_VALUE && Short.MIN_VALUE <= number) {return "short";}
        else if (number <= Integer.MAX_VALUE && Integer.MIN_VALUE <= number) {return "int";}
        else return "long";
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        String result = solution("12345");
        System.out.println(result);
         */
    }

}
