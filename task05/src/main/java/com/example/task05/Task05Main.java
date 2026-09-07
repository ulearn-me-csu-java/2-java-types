package com.example.task05;

public class Task05Main {

    public static String solution(int x) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
        boolean res = true;
        for (; x > 0; x/=10){
            if ((x % 10) % 2 != 0 ){
                res = false;
            }
        }
        if (res) return "TRUE";
        else return "FALSE";
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        String result = solution(1234);
        System.out.println(result);
        */
    }

}
