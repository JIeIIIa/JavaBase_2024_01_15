package com.gmail.onishchenko.homework;

import java.util.Scanner;

public class Loop {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter an origin (value from): ");
        int origin = readInt();
        System.out.print("Enter a bound (value to): ");
        int bound = readInt();

        if (origin > bound) {
            int tmp = origin;
            origin = bound;
            bound = tmp;
        }

        if (origin == bound) {
            System.out.printf("There are no numbers into the interval [%d; %d]", origin, bound);
            return;
        }

        System.out.println("Count by FOR: " + countByFor(origin, bound));
        System.out.println("Count by WHILE: " + countByWhile(origin, bound));
        System.out.println("Count by DO-WHILE: " + countByDoWhile(origin, bound));
    }

    private static int countByFor(int origin, int bound) {
        int result = 0;
        for (int i = origin; i < bound; i++) {
            int sum = 0;
            for (int number = i; number != 0; number /= 10) {
                sum += number % 10;
            }

            if (sum != 0 && i % sum == 0) {
                result++;
            }
        }

        return result;
    }

    private static int countByWhile(int origin, int bound) {
        int result = 0;
        int i = origin;
        while (i < bound) {
            int sum = 0;
            int number = i;
            while(number != 0) {
                sum += number % 10;
                number /= 10;
            }

            if (sum != 0 && i % sum == 0) {
                result++;
            }
            i++;
        }

        return result;
    }

    private static int countByDoWhile(int origin, int bound) {
        int result = 0;
        int i = origin;
        do {
            int sum = 0;
            int number = i;
            do {
                sum += number % 10;
                number /= 10;
            } while (number != 0);

            if (sum != 0 && i % sum == 0) {
                result++;
            }
            i++;
        } while (i < bound);

        return result;
    }

    public static int readInt() {
        while (true) {
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            }
            System.out.println("Enter a number, please");
            scanner.nextLine();
        }
    }
}
