package com.example.task02;

public class Task02Main
{
    private static boolean inRange(long value, long minValue, long maxValue)
    {
        return value >= minValue && value <= maxValue;
    }

    public static String solution(String input)
    {
        long num = Long.parseLong(input);

        if (inRange(num, Byte.MIN_VALUE, Byte.MAX_VALUE)) return "byte";
        if (inRange(num, Short.MIN_VALUE, Short.MAX_VALUE)) return "short";
        if (inRange(num, Integer.MIN_VALUE, Integer.MAX_VALUE)) return "int";

        return "long";
    }

    public static void main(String[] args)
    {
        String result = solution("12345");
        System.out.println(result);
    }

}
