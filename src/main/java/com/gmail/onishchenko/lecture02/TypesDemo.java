package com.gmail.onishchenko.lecture02;

public class TypesDemo {
    public static void main(String[] args) {
        System.out.println("To be or not to be? ");

        boolean a = false;
        System.out.println(a);

        a = true; // some comments

        boolean b = false; //
        boolean c = false;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


        byte age = 42;
        System.out.println("Age = " + age);

        short length = 12_345;
        System.out.println("length = " + length);

        int count = 785;
        System.out.println("count = " + count);

        count = count + 1;
        System.out.println("count (plus 1) = " + count);
        count = count - 10;
        System.out.println("count (minus 10) = " + count);
        count = count / 10;
        System.out.println("count (div 10) = " + count);
        count = count * 2;
        System.out.println("count (multiply 2) = " + count);

        long amount = 9_876_543_321_000L;
        System.out.println("amount = " + amount);


        amount = amount + 1;
        amount++; //post-increment
        ++amount; // pre-increment

        amount = amount - 1;
        amount -= 1;
        amount--; // post-decrement
        --amount; // pre-decrement

        int modifier = 2;
        amount -= 10 + modifier;
        System.out.println("amount = " + amount);


        byte width = 11;
        width = 0b1011;
        System.out.println("Binary: " + width);
        width = 013;
        System.out.println("Octo: " + width);
        width = 0xB;
        System.out.println("Hex: " + width);

        width++;
        width += 1;
        width = (byte) (width + 1);
        width = (byte) modifier;
        System.out.println("width = " + width);
        width -= 10;
        System.out.println("width = " + width);


        double multiplier = 1.1234;
        System.out.println("multiplier = " + multiplier);

        float f = 1.1234F;
        System.out.println("f = " + f);

        width = (byte) multiplier;
        System.out.println("width = " + width);

        multiplier = (double) 3 / 2;
        System.out.println("multiplier = " + multiplier);
    }
}
