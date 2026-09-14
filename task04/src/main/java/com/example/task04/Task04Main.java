package com.example.task04;

public class Task04Main {

    public static float calculate(int a, int b, String operation) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
        switch (operation) {
            case "+":
                return (float) a + b;
            case "-":
                return (float) a - b;
            case "*":
                return (float) a * b;
            case "/":
                return (float) a / b;
            default:
                return 0;

        }

    }

    public static void main(String[] args) {

        float result = calculate(-25, 5, "/");
        System.out.println(result);

    }

}
