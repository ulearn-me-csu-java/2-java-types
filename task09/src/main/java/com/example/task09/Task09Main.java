package com.example.task09;

public class Task09Main {

    public static double solution() {
    float a = 1.0f;
    float b = 3.0f;
    float c = 1.0e9f;
    // Приводим 'a' к double, чтобы деление было точным
    double x = ((double) a / b - 1.0 / 3.0) * c;
    return x;
}

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение
        /*
        System.out.println(solution() == 0.0d);
        */
    }

}
