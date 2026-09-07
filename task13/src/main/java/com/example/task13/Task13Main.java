package com.example.task13;

public class Task13Main {

    public static char toUpperCase(char c) {

        if (c >= 'a' && c <= 'z') {
            return (char) (c - 32);
        }

        return c;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        char result = solution('x');
        System.out.println(result);
         */
    }

}
