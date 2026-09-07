package com.example.task07;

public class Task07Main {

    public static int solution(int n, int m, int k) {
        int Sh = m / k;
        int Vs = n / k;
        return Sh * Vs;
        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей

    }

    public static void main(String[] args) {

        int result = solution(10, 20, 5);
        System.out.println(result);
    }

}
