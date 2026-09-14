package com.example.task08;

public class Task08Main {

    public static boolean solution() {
        double x = 1.0/0.0;
        return x == x + 1;
    }

    public static void main(String[] args) {
        System.out.println(solution());
    }

}
