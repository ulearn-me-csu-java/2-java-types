package com.example.task09;

public class Task09Main {

    public static double solution() {
        float a = 1.0f;
        float b = 3.0f;
        float c = 1.0e9f;
        double x = ((double) a / b - 1.0 / 3.0) * c;

        return x;
    }

    public static void main(String[] args) {
        System.out.println(solution() == 0.0d);
    }

}
