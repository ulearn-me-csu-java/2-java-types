package com.example.task06;

public class Task06Main {

    public static int solution(int x, int y) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей

        int i = x + y;
        int c = 0;
        char[] s = String.valueOf(i).toCharArray();
        for(char j : s)
        {
            c += 1;
        }
        if(i<0)
        {
            c-=1;
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
