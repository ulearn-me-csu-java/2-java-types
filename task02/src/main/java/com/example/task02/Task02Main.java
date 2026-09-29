package com.example.task02;

public class Task02Main {

    public static String solution(String number) {
        long value = Long.parseLong(number);

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
        // Здесь вы можете вручную протестировать ваше решение

        System.out.println(solution("5"));          // byte
        System.out.println(solution("-35000"));      // int
        System.out.println(solution("512"));         // short
        System.out.println(solution("2500000000"));  // long
    }

}
