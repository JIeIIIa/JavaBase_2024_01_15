package com.gmail.onishchenko.homework;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class SteppedArrayV2 {
    // константи ми вивчила пізніше тому було б ок, якби в коді використовували скрізь якесь значення, яке б вважали неможливим для генерації
    // наприклад, максимум, що використовувався для Random + 1
    private static final int NOT_DEFINED_MIN_VALUE = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter rows count (N): ");
        int rowsCount = scanner.nextInt();
        System.out.print("Enter max columns count (M): ");
        int maxColumnsCount = scanner.nextInt();

        solve(rowsCount, maxColumnsCount, -10, 10); // окремий метод, щоб показати крайові випадки

//        Для прикладів нижче закоментувати рядки 11-17 і розкоментувати по черзі рядки 20-21 щоб подивитись на вивід у консолі
//        solve(5, 1, -10, 10); // буде 5 рядків і в кожному порожній маисв, бо кількість елементів в рядку <M
//        solve(10, 2, 0, 1); // у рядку буде або порожній масив, або 0 => абсолютний мінімум буде 0
    }

    private static void solve(int rowsCount, int maxColumnsCount, int minValue, int maxValue) {
        System.out.println("1. Generated stepped array:");
        int[][] matrix = generate(rowsCount, maxColumnsCount);
        fillWithRandomValues(matrix, minValue, maxValue);
        print(matrix);

        System.out.println("\n2. Sorted matrix:");
        sort(matrix);
        print(matrix);

        System.out.println("\n3. Total sum == " + sumAll(matrix));

        System.out.println("\n4.a Min element for each rows:");
        int[] minElements = findMinElements(matrix);
        printMinimums(minElements);

        System.out.print("\n4.b Absolute minimum == ");
        int absoluteMin = findMinElement(minElements);
        printMinimumValue(absoluteMin);

        System.out.println("\n5 Divide each elements");
        divide(matrix, absoluteMin);
        print(matrix);
    }

    public static int[][] generate(int rowsCount, int maxColumnsCount) {
        int[][] result = new int[rowsCount][];
        for (int i = 0; i < result.length; i++) {
            int columns = ThreadLocalRandom.current().nextInt(maxColumnsCount);
            result[i] = new int[columns];
        }

        return result;
    }

    public static void fillWithRandomValues(int[][] matrix, int minValue, int maxValue) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = ThreadLocalRandom.current().nextInt(minValue, maxValue);
            }
        }
    }

    public static void print(int[][] matrix) {
        System.out.println("[");
        for (int[] row : matrix) {
            System.out.print("   [");
            for (int i = 0; i < row.length; i++) {
                if (i > 0) {
                    System.out.print(", ");
                }
                System.out.printf("%3d", row[i]);
            }
            System.out.println("]");
        }
        System.out.println("]");
    }

    public static int[] findMinElements(int[][] matrix) {
        int[] minElements = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            minElements[i] = findMinElement(matrix[i]);
        }

        return minElements;
    }

    public static int findMinElement(int[] array) {
        if (array.length == 0) {
            return NOT_DEFINED_MIN_VALUE;
        }

        int min = array[0];
        for (int element : array) {
            if (element < min) {
                min = element;
            }
        }
        return min;
    }

    public static void foo() {
        int[] array = new int[10];
//        Integer result = findMinElementWithWrapper(array); // error!!!
    }

    public static Integer findMinElementWithWrapper(Integer[] array) { // {1, 2, null, 4, 6, null, 7} -> 1; {null, null} -> null
        if (array.length == 0) {
            return null;
        }

        Integer min = null;
        for (Integer element : array) {
            if (min == null || (element != null && element < min)) {
                min = element;
            }
        }
        return min;
    }

    public static void printMinimums(int[] minValues) {
        for (int i = 0; i < minValues.length; i++) {
            System.out.printf("Row #%2d min value: ", i);
            printMinimumValue(minValues[i]);
        }
    }

    //    звернути увагу де цей метод використовується і як можна уникнути дублювання коду
    public static void printMinimumValue(int minValue) {
        if (minValue == NOT_DEFINED_MIN_VALUE) {
            System.out.println("NOT DEFINED");
        } else {
            System.out.println(minValue);
        }
    }

    public static void printMinimumValue(Integer minValue) {
        if (minValue == null) {
            System.out.println("NOT DEFINED");
        } else {
            System.out.println(minValue);
        }
    }


    public static long sumAll(int[][] matrix) {
        int sum = 0;
        for (int[] row : matrix) {
            for (int element : row) {
                sum += element;
            }
        }

        return sum;
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
        Arrays.sort(array);
    }

    //    Якщо ми вміємо сортувати за зростання, то задачу сортування за спаданням можемо звести до тієї, яку вміємо розв'язувати
    public static void sortDescending(int[] array) {
        sortAscending(array);
        for (int i = 0; i < array.length; i++) { // чому тут "array.length / 2"? чому це працює для масивів, у яких довжина непарне число?
            int tmp = array[i];
            int j = array.length - 1 - i;
            array[i] = array[j];
            array[j] = tmp;
        }
    }

    public static void divide(int[][] matrix, int divider) {
        if (divider == 0 || divider == NOT_DEFINED_MIN_VALUE) {
            System.out.println("Can't divide!(");
            return; // одразу виходимо з методу. так як тип значення що повертається void, то не потрібно після return нічого вказувати
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] /= divider;
            }
        }
    }
}
