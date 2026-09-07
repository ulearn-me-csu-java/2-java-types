package com.example.task02;

public class Task02Main {

    public static String solution(String input) {
        long value = Long.parseLong(input); // Преобразую в лонг, чтобы все значение могли вместиться

        if (value >= Byte.MIN_VALUE && value <= Byte.MAX_VALUE) { // проверяю каждый диапозон типов и возвращаю нужный
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
        String result = solution("12345");
        System.out.println(result);
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        String result = solution("12345");
        System.out.println(result);
         */
    }

}
