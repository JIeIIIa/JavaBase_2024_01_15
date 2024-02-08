package com.gmail.onishchenko.lecture08;

public class LoopDemo {
    public static void main(String[] args) {
        int[] team = {1, 2, 5, 6};
        int age = team[1];
        System.out.println("age == " + age); // 2
//        team[] // 0 <= index <= length-1
        //0 <= x <= -1

        int[][] array = {
                null,
                {1, 4, 6, -10},
                null,
                new int[]{1},
                team
        };

        int[] row = array[1]; // row == {1, 4, 6, -10}

        int cell = array[1][2];
        System.out.println(row[2]);
        System.out.println(cell); // 6


        int[][] matrix = new int[10][6];


        int[][] anotherMatrix = new int[10][];
        for (int i = 0; i < matrix.length; i++) {
            anotherMatrix[i] = new int[6];
        }

        int[][][] cube = new int[2][3][4];

        matrix[2] = row;
        matrix[3] = new int[]{1, 2, 3};

        for (int[] element : array) {
            System.out.println("FOR: " + toStringByFor(element));
            System.out.println("WHILE: " + toStringByWhile(element));
            System.out.println("DO-WHILE: " + toStringByDoWhile(element));
        }
    }

    public static String toStringByFor(int[] array) {
        if (array == null) {
            return "";
        }
        String result = "[";
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                result += ", ";
            }
            result += array[i];
        }
        result += "]";

        return result;
    }

    public static String toStringByWhile(int[] array) {
        if (array == null) {
            return "";
        }
        String result = "[";
        int i = 0;
        while (i < array.length) {
            if (i > 0) {
                result += ", ";
            }
            result += array[i];
            i++;
        }
        result += "]";

        return result;
    }

    public static String toStringByDoWhile(int[] array) {
        if (array == null) {
            return "";
        }
        String result = "[";
        int i = 0;
        if (i < array.length) {
            do {
                if (i > 0) {
                    result += ", ";
                }
                result += array[i];
                i++;
            } while (i < array.length);
        }
        result += "]";

        return result;
    }
}
