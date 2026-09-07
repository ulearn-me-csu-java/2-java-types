package com.example.task08;

public class Task08Main {

    public static boolean solution() {
        // TODO измените тип и значение переменной x, чтобы возвращалось значение true

        float x = (float) Math.pow(2,25);
        return x == x + 1;
    }

    public static void main(String[] args) {
        System.out.println(solution());
    }

}
