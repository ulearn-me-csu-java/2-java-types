package com.example.task05;

public class Task05Main {

    public static String solution(int x) {
        if (x/10000%2==0 && x/1000%10%2==0 && x/100%10%2==0 && x/10%2==0 && x%10%2==0){
            return "TRUE";
        }


        return "FALSE";
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        //int a = 10;
        //System.out.println(a/10%2);


        String result = solution(1234);
        System.out.print(result);

    }

}
