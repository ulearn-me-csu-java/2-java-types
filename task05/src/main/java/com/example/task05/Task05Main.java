package com.example.task05;

public class Task05Main {

    public static String solution(int x) {
        String xString = Integer.toString(x);
        if (xString.contains("1") || xString.contains("3") || xString.contains("5") || xString.contains("7") || xString.contains("9")){
            return "FALSE";
        } else {
            return "TRUE";
        }
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        String result = solution(1234);
        System.out.println(result);
        */
    }

}
