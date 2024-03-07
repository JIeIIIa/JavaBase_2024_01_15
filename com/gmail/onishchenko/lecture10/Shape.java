package com.gmail.onishchenko.lecture10;

public class Shape {
    String name;
    String color;
    int size;

    public Shape() {
        name = "Abstract shape";
        color = "black";
        size = 10;
    }

    //
    public Shape(String name) {
        this();
        this.name = name;
    }

    public Shape(String name, String color) {
        this(name);
        this.color = color;
    }

    public Shape(String name, String color, int size) {
        this(name, color);
        this.size = size;
    }

    public void greeting() {
        String name = "Fake name";
        System.out.println("Hello, I'm a " + name);
        System.out.println("My actual name is " + this.name);
    }
}

