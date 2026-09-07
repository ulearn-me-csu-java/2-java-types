package com.example.task05;

public class Task05Main {

    public static String solution(int x) {

        for(char l : String.valueOf(x).toCharArray() ){
            if(Integer.parseInt(String.valueOf(l), 10) % 2 == 1 ){
                return "FALSE";
            }
        }

        return "TRUE";
    }

    public static void main(String[] args) {
        String result = solution(1234);
        System.out.println(result);
    }

}
