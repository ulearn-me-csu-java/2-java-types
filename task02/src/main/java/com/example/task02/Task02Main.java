package com.example.task02;

import java.math.BigInteger;

public class Task02Main {

    public static String solution(String input) {
        BigInteger number = new BigInteger(input);

        // Проверяем byte: от -128 до 127
        if (number.compareTo(new BigInteger("-128")) >= 0 &&
                number.compareTo(new BigInteger("127")) <= 0) {
            return "byte";
        }

        // Проверяем short: от -32768 до 32767
        if (number.compareTo(new BigInteger("-32768")) >= 0 &&
                number.compareTo(new BigInteger("32767")) <= 0) {
            return "short";
        }

        // Проверяем int: от -2147483648 до 2147483647
        if (number.compareTo(new BigInteger("-2147483648")) >= 0 &&
                number.compareTo(new BigInteger("2147483647")) <= 0) {
            return "int";
        }

        // Если не подошло ни одно из предыдущих, то long
        return "long";
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        String result = solution("5");
        System.out.println(result); // byte

        result = solution("-35000");
        System.out.println(result); // int

        result = solution("512");
        System.out.println(result); // short

        result = solution("2500000000");
        System.out.println(result); // long
    }

}