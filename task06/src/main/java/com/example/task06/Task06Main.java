package com.example.task06;

public class Task06Main {

    public static int solution(int x, int y) {

        long S = (long) x+y;
        String s = String.valueOf(S);
        int sl = s.length();
        if (S < 0){
            sl-=1;
        }

        return sl;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int result = solution(12, 34);
        System.out.println(result);

    }

}
