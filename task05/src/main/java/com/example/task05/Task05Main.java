package com.example.task05;

public class Task05Main {

    public static String solution(int x) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
        String number = String.valueOf(x);
        String flag = "TRUE";
        for (int i = 0; i < number.length(); i++){
            if ( (number.charAt(i) - '0') % 2 !=0){
                flag = "FALSE";
            }
        }
        return flag;
    }

    public static void main(String[] args) {

        String result = solution(624);
        System.out.println(result);

    }

}
