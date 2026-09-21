package com.example.task06;

public class Task06Main {

    public static int solution(int x, int y) {
        long sum = (long) x + y;
        long absSum = Math.abs(sum);

        if (absSum == 0) {
            return 1;
        }

        int count = 0;
        while (absSum > 0) {
            count++;
            absSum /= 10;
        }

        return count;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int result = solution(12, 34);
        System.out.println(result);

    }

}