package com.example.task04;

public class Task04Main {

    public static float calculate(int a, int b, String operation) {
        float aFloat = a;
        float bFloat = b;

        if (operation == "+"){
            return aFloat + bFloat;
        } else if (operation == "-") {
            return aFloat - bFloat;
        } else if (operation == "*") {
            return aFloat * bFloat;
        } else {
            return aFloat / bFloat;
        }
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        float result = calculate(-25, 5, "/");
        System.out.println(result);
        */
    }

}
