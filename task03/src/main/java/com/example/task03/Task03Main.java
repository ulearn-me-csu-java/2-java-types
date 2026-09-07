package com.example.task03;

public class Task03Main {

    public static int getMetreFromCentimetre(int centimetre) {

        return centimetre / 100;
    }

    public static void main(String[] args) {
        int result = getMetreFromCentimetre(1245);
        System.out.println(result);
    }

}
