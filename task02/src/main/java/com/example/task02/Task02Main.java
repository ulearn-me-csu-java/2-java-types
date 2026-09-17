package com.example.task02;

public class Task02Main {

    public static String solution(String input) {
        long val = Long.parseLong(input);
        if (val >= Byte.MIN_VALUE && val <= Byte.MAX_VALUE) {
            return "byte";
        }
        if (val >= Short.MIN_VALUE && val <= Short.MAX_VALUE) {
            return "short";
        }
        if (val >= Integer.MIN_VALUE && val <= Integer.MAX_VALUE) {
            return "int";
        }
        return "long";
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        String result = solution("12345");
        System.out.println(result);
         */
        String result = solution("12345");
        System.out.println(result);
    }

}
