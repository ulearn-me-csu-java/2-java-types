package com.example.task06;

public class Task06Main {

    public static int solution(int x, int y) {
        int sum = x + y;
        sum = Math.abs(sum);
        int k = 0;

        if (sum == 0) {
            return 1;
        }
        while (sum > 0) {
            k++;
            sum = sum / 10;
        }

        return k;
    }

    public static void main(String[] args) {

        int result = solution(12, 34);
        System.out.println(result);

    }

}
