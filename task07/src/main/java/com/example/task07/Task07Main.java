package com.example.task07;

public class Task07Main {

    public static int solution(int n, int m, int k) {
        int tentsAlongN = n / k;
        int tentsAlongM = m / k;
            return tentsAlongN * tentsAlongM;
    }

    public static void main(String[] args) {

        int result = solution(10, 20, 5);
        System.out.println(result);

    }

}
