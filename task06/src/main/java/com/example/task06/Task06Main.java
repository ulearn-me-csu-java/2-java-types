package com.example.task06;
import java.math.*;

public class Task06Main {

    public static int solution(int x, int y) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
        int summa = Math.abs(x+y);
        String sum = Integer.toString(summa);
        return sum.length();
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int result = solution(1278, 34);
        System.out.println(result);

    }

}
