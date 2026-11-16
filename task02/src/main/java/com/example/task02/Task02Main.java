package com.example.task02;

public class Task02Main {

    public static String solution(String input) {
        long inputConverted = Long.parseLong(input.trim());
        String answer = null;
        if (inputConverted <= Byte.MAX_VALUE && inputConverted >= Byte.MIN_VALUE) {answer =  "byte";}
        else if (inputConverted <= Short.MAX_VALUE && inputConverted >= Short.MIN_VALUE) { answer =  "short"; }
        else if (inputConverted <= Integer.MAX_VALUE && inputConverted >= Integer.MIN_VALUE) { answer =  "int"; }
        else if (inputConverted <= Long.MAX_VALUE && inputConverted >= Long.MIN_VALUE) { answer =  "long"; }
        return answer;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        String result = solution("12345");
        System.out.println(result);
         */
    }

}
