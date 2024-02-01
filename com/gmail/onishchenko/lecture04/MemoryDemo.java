package com.gmail.onishchenko.lecture04;

import java.util.Scanner;

public class MemoryDemo {
    public int value = 10;

    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        Scanner scanner = new Scanner(System.in);
        method(i);
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        MemoryDemo memoryDemo = new MemoryDemo();
        System.out.println(memoryDemo.value);
        foo(memoryDemo);
        System.out.println(memoryDemo.value);
    }

    public static int method(int param) {
        int k = 3;
        System.out.println(param * k);

        param = k;
        return k;
    }

    public static void foo(MemoryDemo param) {
        param.value = 100;
    }

}
