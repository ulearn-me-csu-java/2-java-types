package com.example.task03;

public class Task03Main {

    public static int getMetreFromCentimetre(int centimetre) {

        int answer = centimetre / 100;

        return answer;
    }

    public static void main(String[] args) {
        int result = getMetreFromCentimetre(345);
        System.out.println(result);

    }

}
