package com.example.task14;

public class Task14Main {


    public static int reverse(int value) {

        // TODO напишите здесь код, переставляющий цифры числа в обратном порядке  
        char[] text = (String.valueOf(value))  .toCharArray();
        int reversNumber = 0;
        for (int i = 1;  i <= text.length; i++){
            reversNumber += (int)(text[text.length - i]-'0') * (int)Math.pow(10, text.length - i);
        }

        return reversNumber;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        
        int result = reverse(345);
        System.out.println(result);
        
    }


}
