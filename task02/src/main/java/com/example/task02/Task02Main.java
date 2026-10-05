package com.example.task02;

public class Task02Main {

    public static String solution(String input) {
        long number = Long.parseLong(input);

        if (number >= -128 && number <= 127) {
            return "byte";
        } else if (number >= -32768 && number <= 32767) {
            return "short";
        } else if (number >= -2147483648L && number <= 2147483647) {
            return "int";
        } else {
            return "long";
        }
        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        String result = solution("12345");
        System.out.println(result);

    }

}
