package com.example.task05;

public class Task05Main {

    public static boolean solution(int number) {
        if (number == 0) {
            return true;
        }

        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 != 0) {
                return false;
            }
            number /= 10;
        }

        return true;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение

        System.out.println(solution(6204));  // true
        System.out.println(solution(6205));  // false
        System.out.println(solution(0));     // true
        System.out.println(solution(888));   // true
    }

}