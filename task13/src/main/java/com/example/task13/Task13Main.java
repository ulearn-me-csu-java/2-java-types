package com.example.task13;

public class Task13Main {

    public static char toUpperCase(char c) {
        int diff = 'a' - 'A'; // разница в кодах между маленькой и большой буквой
        char result = (char) (c - diff);
        return result;
    }

    public static void main(String[] args) {

        char result =  toUpperCase('x');
        System.out.println(result);

    }

}
