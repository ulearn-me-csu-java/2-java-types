package com.example.task04;

public class Task04Main {

    public static float calculate(int a, int b, String operation) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
        float result = 0;

        if (operation == "+") {
            result = (float) a + b;
        }
        if (operation == "-") {
            result = (float) a - b;
        }
        if (operation == "/") {
            result = (float) a / b;
        }
        if (operation == "*") {
            result = (float) a * b;
        }

        return result;
    }

    public static void main(String[] args) {

        float result = calculate(-25, 5, "/");
        System.out.println(result);

    }

}
