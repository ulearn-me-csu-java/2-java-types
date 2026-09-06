package com.example.task07;

public class Task07Main {

    public static int solution(int n, int m, int k) {
        int countLen = n / k;
        int countWid = m / k;
        return countLen * countWid;
    }

    public static void main(String[] args) {

        int result = solution(20, 50, 3);
        System.out.println(result);

    }

}
