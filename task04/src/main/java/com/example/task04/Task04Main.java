package com.example.task04;

public class Task04Main {

    public static float calculate(int a, int b, String operation) {
        float result;

        switch (operation) {
            case "+":
                result = a + b;
                break;

            case "-":
                result = a - b;
                break;

            case "*":
                result = a * b;
                break;

            case "/":
                result = (float) a / b;
                break;

            default:
                throw new IllegalArgumentException();
        }

        return result;
    }

    public static void main(String[] args) {
        float result = calculate(-25, 5, "/");
        System.out.println(result);
    }

}
