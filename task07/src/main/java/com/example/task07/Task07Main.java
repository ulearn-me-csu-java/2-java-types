package com.example.task07;

public class Task07Main {

    public static int solution(int n, int m, int k) {
        int tentsAlongN = n / k;
        int tentsAlongM = m / k;
        return tentsAlongN * tentsAlongM;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение

        System.out.println(solution(20, 50, 3)); // 96
    }

}
