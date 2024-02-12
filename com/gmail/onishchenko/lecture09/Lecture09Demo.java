package com.gmail.onishchenko.lecture09;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Lecture09Demo {
    public static void main(String[] args) {
//        bubbleSoretDemo();
//        task1();
        task2();
    }

    private static void bubbleSoreDemo() {
        //        int[] array = {1, 5, 3, 6, 0, 1, -10};
        int[] array = generate(100);
        System.out.println("Original array: ");
        print(array);
        bubbleSortVersion2(array);
        System.out.println("\nSorted array:   ");
        print(array);


        System.out.println();
        byte number = -128;
        number--;
        System.out.println("Number: " + number);
    }

//    1, 5, 3, 6, 0, 1, -10
//    1, 3, 5, 0, 1, -10, 6
//    1, 3, 0, 1, -10, 5, 6
//    1, 0, 1, -10, 3, 5, 6


    public static void bubbleSortVersion2(int[] array) {
        int count = 0;
        for (int i = 0; i <= array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                count++;
                if (array[j] > array[j + 1]) {
                    swap(array, j);
                }
            }
        }
        System.out.println("\nCount == " + count);
    }

    public static void print(int[] array) {
        for (int element : array) {
            System.out.print(element + ", ");
        }
        System.out.println();
    }

    public static int[] generate(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(99);
        }

        return array;
    }

    public static void bubbleSortReverse(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] < array[j + 1]) {
                    swap(array, j);
                }
            }
        }
    }

    private static void swap(int[] array, int i) {
        int tmp = array[i];
        array[i] = array[i + 1];
        array[i + 1] = tmp;
    }

    private static void swapPair(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }


    /**
     * a. Задати масив цілих чисел довжини N елементів та заповнити його рандомними числами
     * відсортувати масив та вивести на екран. Поміняти місцями перший та останній елемент, вивести масив на екран ще раз.
     */
    public static void task1() {
        int size = 10;
        int[] array = generate(size);
        print(array);
        bubbleSortVersion2(array);
        print(array);
        swapPair(array, 0, array.length - 1);
        print(array);
    }


    /**
     * Створити масив з рендомних чисел довжини N (N вводимо з консолі; N має бути парним числом)
     * Розбити масив на 2 масиви рівної довжини
     * Відсортувати першу половину масива за зростанням та вивести на екран
     * Відсортувати другу частину масивав за спаданням і також вивести на екран
     */
    public static void task2() {
        System.out.print("Enter array size: ");
//        int size = readOddInt();
        int size = 20;
        System.out.println("\nUSE PREDEFINED VALUE: " + size);

        int[] array = generate(size);
        System.out.println("Generated array:");
        print(array);
        System.out.println("Sort ascending (the first part):");
        bubbleSort(array, 0, array.length / 2);
        print(array);
        System.out.println("Sort descending (the second part):");
        bubbleSortReverse(array, array.length / 2, array.length);
        print(array);
    }

    private static int readOddInt() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if (number > 0 && number % 2 == 0) {
                    return number;
                }
            }
            System.out.println("Enter an odd number");
            scanner.nextLine();
        }
    }

    public static void bubbleSort(int[] array, int minIndex, int maxIndex) {

        for (int j = minIndex; j < maxIndex - 1; j++) {
            for (int i = minIndex; i < maxIndex - j - 1; i++) {
                int tmp;
                if (array[i] > array[i + 1]) {
                    tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                }
            }

        }
    }

    public static void bubbleSortReverse(int[] array, int minIndex, int maxIndex) {

        for (int j = 0; j < maxIndex - minIndex - 1; j++) {
            for (int i = minIndex; i < maxIndex - 1; i++) {
                int tmp;
                if (array[i] < array[i + 1]) {
                    tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                }
            }

        }
    }
}
