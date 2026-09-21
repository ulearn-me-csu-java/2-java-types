package com.example.task04;

public class Task04Main {

    public static float calculate(int a, int b, String operation) {
        switch (operation) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return (float) a / b;
            default:
                return 0;
        }
    }

}
