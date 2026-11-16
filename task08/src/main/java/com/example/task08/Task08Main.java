package com.example.task08;

public class Task08Main {

    public static boolean solution() {
        // TODO измените тип и значение переменной x, чтобы возвращалось значение true

        float x = (float) Math.pow(2,24);
        System.out.println(Math.nextUp(x));
        System.out.println(Math.nextUp(x+1));
        return x == x + 1;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение
        System.out.println(solution());
    }

}
