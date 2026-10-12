package com.example.task06;

public class Task06Main {

    public static int solution(int x, int y) {

        int sum = Math.abs(x + y);
        int c =0;

        if (sum == 0){
            return  1;
        }

        while (sum > 0){
            c ++;
            sum = sum / 10;
        }
        return c;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int result = solution(12, 34);
        System.out.println(result);
        */
    }

}
