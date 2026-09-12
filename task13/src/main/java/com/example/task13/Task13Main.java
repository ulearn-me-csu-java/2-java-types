package com.example.task13;

public class Task13Main {

    public static char toUpperCase(char c) {

        int code = (int) c;
        code -= 32;
        return (char)code;
    }

    public static void main(String[] args) {

        char result = toUpperCase('b');
        System.out.println(result);
    }

}
