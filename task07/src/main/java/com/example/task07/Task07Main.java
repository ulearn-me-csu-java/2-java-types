package com.example.task07;

public class Task07Main
{
    public static int solution(int n, int m, int k)
    {
        // Разместим палатки kxk вдоль n и вдоль m, и для захвата всей площади перемножим.
        // Делим целочисленно, чтобы уж точно влезло
        return (n / k) * (m / k);
    }

    public static void main(String[] args)
    {
        int result = solution(10, 20, 5);
        System.out.println(result);
    }
}
