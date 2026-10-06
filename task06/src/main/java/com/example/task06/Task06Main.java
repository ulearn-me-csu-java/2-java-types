package com.example.task06;

public class Task06Main {

    public static int solution(int x, int y) {

        long sum = (long) x + (long) y;

        if (sum == 0) return 1;

        sum = Math.abs(sum);

        int count = 0;
        while (sum > 0) {
            count++;
            sum /= 10;
        }

        return count;
    }

    public static void main(String[] args) {

        int result = solution(12, 34);
        System.out.println(result);

    }

}
