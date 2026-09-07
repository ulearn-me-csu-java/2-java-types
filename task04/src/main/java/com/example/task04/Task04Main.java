package com.example.task04;

public class Task04Main {

    public static float calculate(int a, int b, String operation) {
        if (operation.equals("+")) {
            return a + b;
        } else if (operation.equals("-")) {
            return a - b;
        } else if (operation.equals("*")) {
            return a * b;
        } else if (operation.equals("/")) {
            return (float) a / b;
        } else return 0;
    }

    public static void main(String[] args) {
        float result = calculate(-25, 5, "/");
        System.out.println(result);
    }

}
