package com.gmail.onishchenko.homework;

public class Shuttles {
    public static void main(String[] args) {
        int[] shuttles = generateNumbers(100);
        print(shuttles);
    }

    public static int[] generateNumbers(int size) {
        if (size <= 0) {
            return new int[0];
        }
        int[] shuttles = new int[size];
        shuttles[0] = 1;
        for (int i = 1; i < shuttles.length; i++) {
            shuttles[i] = nextLucky(shuttles[i - 1]);
        }

        return shuttles;
    }

    public static void print(int[] shuttles) {
        for (int i = 0; i < shuttles.length; i++) {
            System.out.printf("Shuttle[%03d]: #%d\n", i + 1, shuttles[i]);
        }
    }


    public static int nextLucky(int current) {
        do {
            current++;
        } while (isNotLucky(current));
        return current;
    }


    public static boolean isNotLucky(int number) {
        while (number > 0) {
            int digit = number % 10;
            if (digit == 4 || digit == 9) {
                return true;
            }
            number /= 10;
        }
        return false;
    }
}
