package com.example.task04;

public class Task04Main {

    public static float calculate(int a, int b, String operation) {
        float answer = 0;
        float a1 = a;
        float b1 = b;

        if (operation == "/" && b != 0){
            answer = a1 / b1;
        }
        else if (operation == "+"){
            answer = a1+b1;
        }
        else if (operation == "-"){
            answer = a1-b1;
        }
        else if (operation == "*"){
            answer = a1 * b1;
        }
        else{
            return 0;
        }

        return answer;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        float result = calculate(-25, 5, "/");
        System.out.println(result);
    }

}
