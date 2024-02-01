package com.gmail.onishchenko.lecture04;

import java.sql.SQLOutput;
import java.util.concurrent.ThreadLocalRandom;

public class Lecture04 {
    public static void main(String[] args) {
//        ifExample();
//        ternaryOperator();
//        switchDemo();

//        int a1 = 1;
//        int a2 = 2;
//        int a3 = 42;
//        int a4 = -10;

        int value = ThreadLocalRandom.current().nextInt(10, 21);

        String[] lines;


        lines = new String[]{"", null, "qwerty"};//new String[10];
        int size = 4;
        int[] array = new int[size];
        array[0] = 1;
        array[1] = 2;
        array[2] = 42;
        array[3] = -10;

        int[] anotherArray = {
                1, 2, 42, 1, 2, 42, 1, 2, 42, 1, 2, 42
        };


//        System.out.println("a1 == " + a3);
        System.out.println("array[0] == " + array[2]);
        array[1] = 1234;
        System.out.println("Length of array is " + array.length);
        System.out.println("array[1] == " + array[1]);
        System.out.println(array);

//        System.out.print("{" + array[0] );
//        System.out.print(", " + array[1]);
//        System.out.print(", " + array[2]);
//        System.out.print(", " + array[3]);
//        System.out.println("}");
        printArray(array);
        printArray(anotherArray);
        printArrayWithLoop(anotherArray);

    }

    public static void printArray(int[] array) {
        int index = 0;
        if (array.length > index) {
            System.out.print("{" + array[0]);
        }
        index++;
        if (array.length > index) {
            System.out.print(", " + array[1]);
        }
        index++;
        if (array.length > index) {
            System.out.print(", " + array[2]);
        }
        index++;
        if (array.length > index) {
            System.out.print(", " + array[3]);
        }
        System.out.println("}");
    }

    private static void printArrayWithLoop(int[] array) {
        int index = 0;
        System.out.print("{");
        while (array.length > index && index % 2 != 0) {
            System.out.print(", " + array[index]);
//            index++;
        }
        System.out.println("}");
    }

    private static void switchDemo() {
        methodWithError();

        int points = 96;
        if (points == 100) {
            System.out.println("Very well!");
        } else if (points == 90 || points == 95) {
            System.out.println("Good");
        } else if (points == 80) {
            System.out.println("Not bad");
        } else {
            System.out.println("Unknown state");
        }

        switch (points) {
            case 100:
                System.out.println("Very well!");
                break;
            case 90:
            case 95:
                System.out.println("Good");
                break;
            case 80:
                System.out.println("Not bad");
                System.out.println("Unknown state");
                break;
            default:
                System.out.println("Unknown state");
        }
    }

    public static void methodWithError() {
        int a = 10;
        int b = 0;
        int result = a / b;
    }

    private static void ternaryOperator() {
        int age = 23;
        String result = age > 16 ? age < 20 ? "a" : "b" : "Too young";

        System.out.println(result);
    }

    private static void ifExample() {
        String result;
        int age = 23;
        if (age > 16) {
            result = "It's OK";
        } else {
            result = "Too young";
        }

        System.out.println(result);
    }
}
