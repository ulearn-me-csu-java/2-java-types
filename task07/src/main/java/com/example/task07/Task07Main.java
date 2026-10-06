package com.example.task07;

public class Task07Main {

    public static int solution(int n, int m, int k) {

        if (k <= 0) return 0;
        int value1 = n / k;
        int value2 = m / k;
        return value1 * value2;
    }

    public static void main(String[] args) {

        int result = solution(10, 20, 5);
        System.out.println(result);

    }

}
