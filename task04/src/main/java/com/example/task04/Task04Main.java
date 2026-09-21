package com.example.task04;

public class Task04Main {

    public static float calculate(int a, int b, String operation) {
        float dividend = a;
        if (operation.equals("/")) {
            return dividend / b;
        }
        if (operation.equals("+")) {
            return dividend + b;
        }
        if (operation.equals("*")) {
            return dividend * b;
        }
        if (operation.equals("-")) {
            return dividend - b;
        }

        return 0;
    }

    public static void main(String[] args) {
        float result = calculate(-25, 5, "/");
        System.out.println(result);
    }

}
