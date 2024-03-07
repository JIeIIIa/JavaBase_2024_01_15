package com.gmail.onishchenko.homework;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class SteppedArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Rows (N) = ");
        int rows = 4; // scanner.nextInt();

        System.out.println("Max columns (M*) = ");
        int maxColumns = 2;//scanner.nextInt();

        int[][] matrix = generate(rows, maxColumns);
        print(matrix);

        System.out.println("SORTING....");
        sort(matrix);
        print(matrix);

        System.out.println("Sum = " + sum(matrix));
        int[] minByRow = findMinByRow(matrix);
        System.out.println("Mins by row: " + toString(minByRow));

        int absoluteMin = min(minByRow);
        System.out.println("Absolute min = "  + toString(absoluteMin));

        divide(matrix, absoluteMin);
        print(matrix);

    }

    public static String toString(int number) {
        return number == Integer.MAX_VALUE ? "NOT DEFINED" : String.valueOf(number);
    }
    private static String toString(int[] array) {
        String result = "[";
        for (int i = 0; i < array.length; i++) {

            result += toString(array[i]);

            if(i != array.length - 1) {
                result += ", ";
            }
        }

        result += "]";
        return result;
    }

    private static int[][] generate(int rows, int maxColumns) {
        int[][] matrix = new int[rows][];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = new int[ThreadLocalRandom.current().nextInt(maxColumns)];
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = ThreadLocalRandom.current().nextInt(0, 1);
            }
        }

        return matrix;
    }

    private static void print(int[][] matrix) {
        System.out.println("[");
        for (int[] row : matrix) {
            System.out.println("\t" + Arrays.toString(row));
        }
        System.out.println("]");
    }

    public static void sort(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            if (i % 2 == 0) {
                sortAscending(matrix[i]);
            } else {
                sortDescending(matrix[i]);
            }
        }
    }

    public static void sortAscending(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j);
                }
            }
        }
    }

    public static void sortDescending(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] < array[j + 1]) {
                    swap(array, j);
                }
            }
        }
    }

    private static void swap(int[] array, int index) {
        int tmp = array[index];
        array[index] = array[index + 1];
        array[index + 1] = tmp;

    }


    private static int sum(int[][] matrix) {
        int sum = 0;
        for (int[] row : matrix) {
            for (int element : row) {
                sum += element;
            }
        }

        return sum;
    }

    public static int[] findMinByRow(int[][] matrix) {
        int[] result = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            result[i] = min(matrix[i]);
        }

        return result;
    }

    private static int min(int[] row) {

        int min = Integer.MAX_VALUE;
        int i = 0;
        while (i < row.length) {
            if (min > row[i]) {
                min = row[i];
            }
            i++;
        }
        return min;
    }

    public static Integer[] findMinByRowV2(int[][] matrix) {
        Integer[] result = new Integer[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            result[i] = min(matrix[i]);
        }

        return result;
    }

    private static Integer minV2(int[] row) {

        Integer min = null;
        int i = 0;
        while (i < row.length) {
            if (min == null || min > row[i]) {
                min = row[i];
            }
            i++;
        }
        return min;
    }

    public static void divide(int[][] matrix, int divider) {
        if (divider == 0 || divider == Integer.MAX_VALUE) {
            System.out.println("Can't divide");
            return;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] /= divider;
            }
        }
    }
}
