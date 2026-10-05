package com.example.task08;

public class Task08Main {

    public static boolean solution() {
    // Меняем int на float и ставим огромное число, чтобы точности не хватило на +1
    float x = 1e20f; 
    return x == x + 1;
}

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение
        /*
        System.out.println(solution());
        */
    }

}
