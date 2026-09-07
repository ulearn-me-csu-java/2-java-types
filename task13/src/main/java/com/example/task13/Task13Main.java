package com.example.task13;

public class Task13Main {

    public static char toUpperCase(char c) {

        // TODO привести букву к верхнему регистру

        return (char) (c - 32);
    }

    public static void main(String[] args) {
        char result = toUpperCase('x');
        System.out.println(result);
    }

}
