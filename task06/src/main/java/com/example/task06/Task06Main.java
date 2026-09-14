package com.example.task06;

public class Task06Main {

    public static int solution(int x, int y) {

        int summ = Math.abs(x + y);
        String sum = Integer.toString(summ);
        return sum.length();
        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей

    }

    public static void main(String[] args) {

        int result = solution(-111, -222);
        System.out.println(result);

    }

}
