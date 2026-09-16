package com.example.task02;

public class Task02Main {

    public static String solution(String input) {

        long number = Long.parseLong(input);

        if ((-128 <= number) && (number <= 127)) {
            return "byte";
        }

        if ((-32768 <= number) && (number <= 32767)) {
            return "short";
        }

        if ((-2_147_483_648 <= number) && (number <= 2_147_483_647)) {
            return "int";
        }

        return "long";
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        String result = solution("12345");
        System.out.print(result);

    }

}
