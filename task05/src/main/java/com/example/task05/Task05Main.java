package com.example.task05;

public class Task05Main {

    public static String solution(int x) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
        boolean b = true;
        char[] c = String.valueOf(x).toCharArray();
        for(char i : c)
        {
            if(Character.getNumericValue(i) % 2 == 0) {

            }
            else {return "FALSE";}
        }
        return "TRUE";
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
