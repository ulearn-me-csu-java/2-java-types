package com.example.task06;

public class Task06Main {

    public static int solution(int x, int y) {
        int sum = Math.abs(x + y);
        String s = Integer.toString(sum);
        return s.length();
    }

    public static void main(String[] args) {
        int result = solution(625, 5324);
        System.out.println(result);
    }
}
