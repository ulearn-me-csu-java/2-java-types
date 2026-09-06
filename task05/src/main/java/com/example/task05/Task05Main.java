package com.example.task05;

public class Task05Main {

    public static String solution(int x) {

        if (x == 0) {
            return "TRUE";
        }

        for (int n = x; n > 0; n /= 10) {
            int digit = n % 10;

            if (digit % 2 != 0) {
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
