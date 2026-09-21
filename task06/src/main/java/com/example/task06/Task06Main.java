package com.example.task06;

public class Task06Main
{
    public static int solution(int x, int y)
    {
        long sum = (long) x + y;
        long absSum = Math.abs(sum);

        int count = 1;
        while (absSum >= 10)
        {
            absSum /= 10;
            count++;
        }

        return count;
    }

    public static void main(String[] args)
    {
        int result = solution(12, 34);
        System.out.println(result);
    }
}
