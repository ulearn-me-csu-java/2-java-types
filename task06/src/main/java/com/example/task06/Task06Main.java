package com.example.task06;

public class Task06Main {

    public static int solution(int x, int y) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
        int sum = Math.abs(x + y);
        String result = String.valueOf(sum);
        return result.length();
    }

    public static void main(String[] args) {

        int result = solution(12, 34);
        System.out.println(result);
    }

}
