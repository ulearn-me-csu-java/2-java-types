package com.example.task06;

public class Task06Main {

    public static int solution(int x, int y) {
        int summa = x+y;
        if ( summa == 0) {
            return 1;
        }
        else {
            int c = 0;
            while ((Math.abs(summa) > 0)) {
                c++;
                summa =  summa /10;
            }
            return c;
        }
    }

    public static void main(String[] args) {

        int result = solution(12, 34);
        System.out.println(result);
    }

}
