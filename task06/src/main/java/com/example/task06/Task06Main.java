package com.example.task06;

public class Task06Main {

    public static int solution(int a, int b) {
        long sum = Math.abs((long) a + b);

        if (sum == 0) {
            return 1;
        }

        int digitCount = 0;
        while (sum > 0) {
            digitCount++;
            sum /= 10;
        }

        return digitCount;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение

        System.out.println(solution(625, 5324)); // 4
    }

}