package com.example.task13;

public class Task13Main {

    public static char toUpperCase(char c) {
        return (char)(c - ' ');
    }

    public static void main(String[] args) {
        char result = toUpperCase('x');
        System.out.println(result);
    }

}
