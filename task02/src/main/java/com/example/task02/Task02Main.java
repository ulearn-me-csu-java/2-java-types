package com.example.task02;

public class Task02Main {

    public static String solution(String input) {

        long result = Long.parseLong(input);

        if (-128 <= result && result <= 127){
            return "byte";
        } else if (-32_768 <= result && result <= 32_767) {
            return "short";
        } else if (Integer.MIN_VALUE <= result && result <= Integer.MAX_VALUE) {
            return "int";
        } else {
            return "long";
        }
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
