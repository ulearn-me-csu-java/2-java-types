package com.example.task13;

public class Task13Main {

    public static char toUpperCase(char c) {

        return (char) (c - 32);
    }

    public static void main(String[] args) {
        char result = toUpperCase('s');
        System.out.println(result);

    }

}
