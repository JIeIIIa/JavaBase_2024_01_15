package com.gmail.onishchenko.lecture05.naming;

public class ArrayStatistics {
    public static void main(String[] args) {

        int min;
        int average = 0;
        int max;

        int[] array = {1, 4, 3, 2, 5, 6, 7, 6, 5, 3, 5, 6, 7, 8, 6, 5, 4, 3, 7, 8, 7, 5};


        min = array[0];
        max = array[0];
        int i = 0;
        while( i < array.length) {
            if (min > array[i]) {
                min = array[i];
            }
            if (max < array[i]) {
                max = array[i];
            }

            average += array[i];
            i++;
        }

        average /= array.length;

        System.out.println("Min value: " + max);
        System.out.println("Max value: " + min);
        System.out.println("Average value: " + average);
    }
}
