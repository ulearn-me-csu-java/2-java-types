package com.example.task05;

public class Task05Main {

    public static String solution(int x) {
        if (x<0 || x>99999) {
            return "FALSE";
        }
        while (x>0) {
            int y=x%10;
            if (y%2!=0) {
                return "FALSE";
            }
            x=x/10;
        }
        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
        return "TRUE";
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        String result = solution(-22);
        System.out.println(result);

    }

}
