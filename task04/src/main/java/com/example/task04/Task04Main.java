package com.example.task04;

import java.util.Objects;

public class Task04Main {

    public static float calculate(int a, int b, String operation) {

        float result = 0f;
        if (Objects.equals(operation, "+")){
            result = (float) a + b;
        }
        if (Objects.equals(operation, "-")){
            result = (float) a - b;
        }
        if (Objects.equals(operation, "/")){
            if (b != 0){
                result = (float) a / b;
            }else {
                result = 0f;
            }

        }
        if (Objects.equals(operation, "*")){
            result = (float) a * b;
        }

        return result;
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
