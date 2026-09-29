package com.example.task04;

public class Task04Main {

    public static double calculate(int a, int b, String operation) {
        switch (operation) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return (double) a / b;
            default:
                throw new IllegalArgumentException("Неизвестная операция: " + operation);
        }
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение

        System.out.println(calculate(-25, 5, "/")); // -5.0
        System.out.println(calculate(2, 3, "+"));   // 5.0
        System.out.println(calculate(2, 3, "-"));   // -1.0
        System.out.println(calculate(2, 3, "*"));   // 6.0
    }

}