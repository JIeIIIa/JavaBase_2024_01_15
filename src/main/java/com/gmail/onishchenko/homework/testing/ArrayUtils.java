package com.gmail.onishchenko.homework.testing;

public class ArrayUtils {
    public static double average(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        long sum = 0;
        for (int element : array) {
            sum += element;
        }
        return (double) sum / array.length;
    }

    public static boolean isSquare(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        for (int[] row : matrix) {
            if (row == null || row.length != matrix.length) {
                return false;
            }
        }

        return true;
    }
}
