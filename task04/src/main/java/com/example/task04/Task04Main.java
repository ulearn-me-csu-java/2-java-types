package com.example.task04;

public class Task04Main {

    public static float calculate(int a, int b, String operation) {
        if (operation.equals("+")){
            return (float) a +b;
        }
        if (operation.equals("-")){
            return (float) a - b;
        }
        if (operation.equals("*")){
            return (float) a * b;
        }

        return (float) a / b;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        float result = calculate(-25, 5, "/");
        System.out.print(result);

    }

}
