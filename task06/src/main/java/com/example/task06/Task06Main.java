package com.example.task06;

public class Task06Main {

    public static int solution(int x, int y) {


        String sum = Integer.toString(Math.abs(x + y));

        return sum.length();
    }

    public static void main(String[] args) {
        int result = solution(12, 34);
        System.out.println(result);
    }

}
