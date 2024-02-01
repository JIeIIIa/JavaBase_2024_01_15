package com.gmail.onishchenko.lecture03;

import java.util.Scanner;

public class Lecture03 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        characters();
//        int result = calculation(1, 2 * 20);
//        System.out.println("result = " + result);
//        logicalOperations();

//        ifDemo();
        mathDemo();
    }

    private static void ifDemo() {
        System.out.print("Input your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        String line = scanner.nextLine();
        System.out.println("Line is '" + line + "'");
        if (age <= 13 && age >= 0 || validate()) {
            System.out.println("You are too young");
        } else if (age < 21) {
            System.out.println("Your age is " + age);
            System.out.println("Your age is " + age);
        }
    }

    private static void mathDemo() {
        System.out.println(" -= Math operations =- ");
        double value = 3.1415;
        System.out.println("Floor " + Math.floor(value));
        System.out.println("Ceil " + Math.ceil(value));
        System.out.println("Max " + Math.max(value, 1));
        System.out.println("Min " + Math.min(value, 1));

        System.out.println("Abs " + Math.abs(-123));

    }

    private static boolean validate() {
        System.out.println("Call validate method");
        return false;
    }

    private static boolean validate(int age) {
        System.out.println("Call validate method");
        return age % 2 == 0;
    }

    private static void logicalOperations() {
        boolean flag = false;
        System.out.println("NOT: " + !flag);

        boolean a = true;
        boolean b = false;
        System.out.println("AND: " + (a & b));
        System.out.println("OR: " + (a | b));
        System.out.println("XOR: " + (a ^ b));

        boolean boolResult = a & (b | true ^ b | a);

        System.out.println("My favorite value is " + (20 + 22));
    }

    private static void characters() {
        char ch1 = 'B';
        char ch2 = 66;
        char ch3 = '\u0042';


        System.out.println("ch1 = " + ch1);
        System.out.println("ch2 = " + ch2);

        System.out.println("ch2 + 1 == " + (char) (ch2 + 1));
        System.out.println("ch3 = " + ch3);


        int intValue = ch3;
        System.out.println("intValue = " + intValue);
        ch1 = (char) intValue;
//        boolean flag = (boolean) ch1; // ERROR
    }

    private static int calculation() {
        byte b = 123;
        return b + 10;
    }

    private static int calculation(int a, int b) {
        return a + b;
    }
}
