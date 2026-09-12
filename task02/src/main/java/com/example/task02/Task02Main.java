package com.example.task02;

public class Task02Main {

    public static String solution(String input) {
        String answer = " ";
        long number = Long.parseLong(input);
        if (number >= -128 && number <= 127){
            answer = "byte";
        }
        else if (number >= -32768 && number <= 32767 ){
            answer = "short";
        }
        else if (number >= 0 && number <= 65535 ){
            answer = "char";
        }
        else if (number >= -2147483648 && number <= 2147483647 ){
            answer = "int";
        }
        else {
            answer = "long";
        }

        return answer;
    }

    public static void main(String[] args) {
        String result = solution("12345");
        System.out.println(result);
    }

}
