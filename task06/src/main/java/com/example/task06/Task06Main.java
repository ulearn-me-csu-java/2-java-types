package com.example.task06;

public class Task06Main {

    public static int solution(int a, int b) {
        long sum = (long) a + b;
        if (sum == 0) {
            return 1;
        }

        long n = Math.abs(sum);
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int result = solution(625, 375);
        System.out.println(result);

    }

}
