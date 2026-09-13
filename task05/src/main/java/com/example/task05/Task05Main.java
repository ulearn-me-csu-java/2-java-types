package com.example.task05;

public class Task05Main {

    public static String solution(int x) {
        // идея, доставать из input числа его last число с помощью деления на 10. Если число в остатке будет
        // не четное, то FALSE
        while (x > 0){
            int lastNum = x % 10;
            if (lastNum % 2 != 0){
                return "FALSE";
            }
            else {
                x /= 10;
            }
        }
        return "TRUE";
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        String result = solution(1234);
        System.out.println(result);
    }

}
