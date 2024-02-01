package com.gmail.onishchenko.lecture06;

public class Lecture06 {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        if ((a / b) * b == a) {
            System.out.println("mod is zero");
        } else {
            System.out.println("mod is NOT zero");
        }

        if (a % b == 0) {
            System.out.println("mod is zero");
        } else {
            System.out.println("mod is NOT zero");
        }
    }
}
