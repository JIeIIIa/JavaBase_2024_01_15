package com.gmail.onishchenko.lecture16;

import com.gmail.onishchenko.lecture16.sandbox.Point;

public class ImportDemo {
    public static void main(String[] args) {
        Point point = new Point();
        com.gmail.onishchenko.lecture16.subpackage.Point anotherPoint = new com.gmail.onishchenko.lecture16.subpackage.Point();
    }
}
