package com.example.task05;

public class Task05Main {

    public static String solution(int x) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
        String text_X = String.valueOf(x);
        for (char element : text_X.toCharArray()) {
            if ((int)element % 2 == 1){
                return "FALSE";
            }
        }
        return "TRUE";
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        
        String result = solution(220);
        System.out.println(result);
        
    }

}
