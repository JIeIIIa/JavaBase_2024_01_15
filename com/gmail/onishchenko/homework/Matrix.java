package com.gmail.onishchenko.homework;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Matrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter row numbers: ");
        int rows = scanner.nextInt();
        System.out.println("Enter column numbers: ");


        int columns = scanner.nextInt();
        System.out.println("Original matrix");
//        fillMatrix(matrix);                         // option 1
        int[][] matrix = generateMatrix(rows, columns);         // option 2
        printMatrix(matrix);


        System.out.println("Transposed matrix");
        int[][] transposedMatrix = transpose(matrix);
        printMatrix(transposedMatrix);

    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + "  ");
            }
            System.out.println();
        }
    }

    private static void fillMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = ThreadLocalRandom.current().nextInt(100);
            }
        }
    }

    private static int[][] generateMatrix(int rows, int columns) {
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = ThreadLocalRandom.current().nextInt(100);
            }
        }

        return matrix;
    }

    private static int[][] transpose(int[][] matrix) {
        int[][] transposedMatrix = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }
        return transposedMatrix;
    }
}
