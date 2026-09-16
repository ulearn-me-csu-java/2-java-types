package com.example.task08;

public class Task08Main {

    public static boolean solution() {

        float x = 16777216; // Предел точности float ну и оно округляется до 2^24 и таким образом получается x==x

        //int x = 100;

        return x == x + 1;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение
        //int x1 = 2^24+1;
        // =16777217
        System.out.println(solution());

    }

}