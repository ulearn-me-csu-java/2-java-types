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

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
    }

    public static void main(String[] args) {
        String result = solution("5121212121212121212");
        System.out.println(result);
    }

}
