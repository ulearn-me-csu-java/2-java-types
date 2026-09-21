package com.example.task06;

public class Task06Main {

    public static int solution(int x, int y) {

        int sum = x + y;
        return String.valueOf(Math.abs(sum)).length();
    }

    public static void main(String[] args) {
        // Пример для проверки: 625 + 5324 = 5949 -> 4 цифры
        int result = solution(625, 5324);
        System.out.println(result);
    }

}
