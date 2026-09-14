package com.example.task02;

public class Task02Main {

    public static String solution(String input) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо существующей

        Long number = Long.parseLong(input); //возьмём наибольший тип и как по воронке будет проверять в какой наименьший тип войдёт число
        String type = "long";

        if (number <= Integer.MAX_VALUE && number >= Integer.MIN_VALUE){
            type = "int";
        }

        if (number <= Short.MAX_VALUE && number >= Short.MIN_VALUE){
            type = "short";
        }

        if (number <= Byte.MAX_VALUE && number >= Byte.MIN_VALUE){
            type = "byte";
        }

        return type;
    }

    public static void main(String[] args) {

//        String result = solution("2500000000");
//        System.out.println(result);
    }

}
