package com.example.task07;

public class Task07Main {

    public static int solution(int n, int m, int k) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
        if (n < 3 || m < 3){return 0;}
        int width = n / k;
        int height = m / k;
        return width * height;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        
        int result = solution(10, 20, 5);
        System.out.println(result);
        
    }

}
