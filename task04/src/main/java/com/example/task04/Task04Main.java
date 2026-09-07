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
        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей


    }

    public static void main(String[] args) {
        float result = calculate(-25, 5, "/");
        System.out.println(result);
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        float result = calculate(-25, 5, "/");
        System.out.println(result);
        */
    }

}
