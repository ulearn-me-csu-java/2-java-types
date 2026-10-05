package com.example.task06;

public class Task06Main {

    public static int solution(int x, int y) {
        int z=x+y;
        int count=0;
        if (z==0) {
            return 1;
        }
        while (z!=0) {
            z/=10;
            count+=1;
        }
        return count;
        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int result = solution(99, 2);
        System.out.println(result);

    }

}
