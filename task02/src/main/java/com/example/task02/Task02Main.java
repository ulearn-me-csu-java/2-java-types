package com.example.task02;

public class Task02Main {

    public static String solution(String input) {
        long value = Long.parseLong(input);

        if (value >= Byte.MIN_VALUE && value <= Byte.MAX_VALUE) {
            return "byte";
        } else if (value >= Short.MIN_VALUE && value <= Short.MAX_VALUE) {
            return "short";
        } else if (value >= Integer.MIN_VALUE && value <= Integer.MAX_VALUE) {
            return "int";
        } else {
            return "long";
        }
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        String result = solution("12345");
        System.out.println(result);
    }

}