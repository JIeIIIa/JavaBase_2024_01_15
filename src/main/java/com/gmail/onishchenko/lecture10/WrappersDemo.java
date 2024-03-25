package com.gmail.onishchenko.lecture10;

import java.nio.DoubleBuffer;

public class WrappersDemo {
    public static void main(String[] args) {
        byte b = 1;
        Byte byteWrapper = new Byte((byte) 4);
        Byte anotherByteWrapper = 4;

        Integer result = new Integer(b + byteWrapper.byteValue());
        System.out.println("result == " + result);

        System.out.println("1 + null == " + sum(1.0, null));
    }

    public static Double sum(Double a, Float b) {
        return a + b;
    }
}
