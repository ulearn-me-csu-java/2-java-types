package com.example.task06;

public class Task06Main {

    public static int solution(int x, int y) {

        int sum = x + y;

        return String.valueOf(Math.abs(sum)).length();

    }

    public static void main(String[] args) {

        System.out.println(solution(412,6234));

        System.out.println(solution(-111,-4241));

    }

}