package com.example.task06;

public class Task06Main {

    public static int solution(int x, int y) {
        int i =0;
        int sum = x+y;
        if (sum != 0) {
            while (sum != 0) {
                i += 1;
                sum /= 10;
            }
            return i;
        }
        return 1;
    }

    public static void main(String[] args) {
        int result = solution(12, 34);
        System.out.println(result);
    }

}
