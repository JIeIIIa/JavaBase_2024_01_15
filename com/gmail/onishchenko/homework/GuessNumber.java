package com.gmail.onishchenko.homework;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int lives = 3;
        int minValue = 0;
        int maxValue = 10;
        int guessedNumber = new Random().nextInt(maxValue + 1) + minValue;
        System.out.println("guessedNumber = " + guessedNumber);
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.printf("Try to guess a number between %d and %d. You have %d live(-s)", minValue, maxValue, lives);
            lives--;
            number = readInt(scanner, minValue, maxValue);
        } while (lives > 0 && guessedNumber != number);

        printResults(guessedNumber, number);
    }

    private static void printResults(int guessedNumber, int number) {
        if (guessedNumber == number) {
            System.out.println("WIN");
        } else {
            System.out.println("lose:( The number was + " + guessedNumber);
        }
    }

    public static int readInt(Scanner scanner, int min, int max) {
        while (true) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if (number >= min && number < max) {
                    return number;
                }
            }
            System.out.println("Enter a number between 0 and 9");
            scanner.nextLine();
        }
    }
}
