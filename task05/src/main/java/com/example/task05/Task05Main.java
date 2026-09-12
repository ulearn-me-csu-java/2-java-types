package com.example.task05;

public class Task05Main {

    public static String solution(int x) {
        int number = 0;
        while (x != 0){
            number = x % 10;
            if (number % 2 != 0) {
                return "FALSE";
            }
            x = x / 10;
        }
        return "TRUE";
    }

    public static void main(String[] args) {

        String result = solution(1234);
        System.out.println(result);

    }

}
