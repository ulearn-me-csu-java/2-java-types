package com.example.task07;

public class Task07Main {

    public static int solution(int n, int m, int k) {
        int res = (n / k) * (m / k);
        return res;
    }

    public static void main(String[] args) {
        int result = solution(20, 50, 3);
        System.out.println(result);
    }
}
