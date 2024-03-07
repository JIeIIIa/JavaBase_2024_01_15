package com.gmail.onishchenko.lecture03;

public class FloatDemo {
    public static void main(String[] args) {
        double f1 = 0;

        f1 += 0.1;
        f1 += 0.1;
        f1 += 0.1;
        f1 += 0.1;
        f1 += 0.1;
        f1 += 0.1;
        f1 += 0.1;
        f1 += 0.1;
        f1 += 0.1;
        f1 += 0.1;

        double f2 = 0.1F;
        f2 *= 10;

        System.out.println("f1 == f2: " + (f1 == f2));
        System.out.println("Expected f1 value is 1.0, but real value is " + f1);
        System.out.println("Expected f2 value is 1.0, but real value is " + f2);

        System.out.println();
        System.out.println("printf example output:");
        System.out.printf("f1 value %.3f; f2 value %.1f", f1, f2);
    }
}
