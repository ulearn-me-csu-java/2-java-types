package com.example.task02;

public class Task02Main {

    public static String solution(String input) {

        long num = Long.parseLong(input);

        if (Byte.MIN_VALUE <= num && num <= Byte.MAX_VALUE) {
            return "byte";
        } else if (Short.MIN_VALUE <= num && num <= Short.MAX_VALUE) {
            return "short";
        } else if (Integer.MIN_VALUE <= num && num <= Integer.MAX_VALUE) {
            return "int";
        } else return "long";
    }

    public static void main(String[] args) {
        String result = solution("99999999999999999");
        System.out.println(result);
    }

}
