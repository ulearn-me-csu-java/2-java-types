package com.example.task14;

public class Task14Main {


    public static int reverse(int value) {
    int reversed = 0;
    while (value != 0) {
        reversed = reversed * 10 + value % 10; // Берем последнюю цифру и добавляем в конец
        value /= 10; // Убираем последнюю цифру
    }
    return reversed;
}

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int result = reverse(345);
        System.out.println(result);
         */
    }


}
