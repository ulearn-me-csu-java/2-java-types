package com.example.task06;

public class Task06Main {

    public static int solution(int x, int y) {
        int summa = x + y;
        summa = Math.abs(summa);
        int i = 0;
        do {
            summa = summa / 10;
            i++;
        } while (summa != 0);
        return i;
    }

    public static void main(String[] args) {
        int result = solution(12, 34);
        System.out.println(result);
    }

}
