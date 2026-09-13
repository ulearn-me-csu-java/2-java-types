package com.example.task06;

public class Task06Main {

    public static int solution(int x, int y) {

        int count = 0;
        int sum = x + y;

        if (sum < 0) {
            sum = Math.abs(sum);
        }

        if (sum == 0) {
            count = 1;
        }

        while (sum > 0) {
            sum /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int result = solution(12, 34);
        System.out.println(result);
    }

}
