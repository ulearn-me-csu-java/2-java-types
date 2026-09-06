package com.example.task05;

public class Task05Main {

    public static String solution(int x) {

        boolean isEven = true;
        while (x > 0) {
            int ost = x % 10;
            if (ost % 2 != 0) isEven = false;
            x = x / 10;
            if (!isEven) {
                return "FALSE";
            }
        }
        return "TRUE";
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
