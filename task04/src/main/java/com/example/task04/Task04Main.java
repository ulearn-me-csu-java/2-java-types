package com.example.task04;

public class Task04Main
{
    public static float calculate(int a, int b, String operation)
    {
        return switch (operation)
        {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> (float) a * b;
            case "/" -> (float) a / b;
            default -> throw new IllegalArgumentException("Неподходящая операция");
        };
    }

    public static void main(String[] args)
    {
        float result = calculate(-25, 5, "/");
        System.out.println(result);
    }
}
