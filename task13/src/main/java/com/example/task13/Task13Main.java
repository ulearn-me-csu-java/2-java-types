package com.example.task13;

public class Task13Main {

    public static char toUpperCase(char c) {

        // TODO привести букву к верхнему регистру
        c = (char)((int)c - 32);
        return c;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        
        char result = toUpperCase('x');
        System.out.println(result);
        
    }

}
