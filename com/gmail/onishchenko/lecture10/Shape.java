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

class ShapeRunner {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.name = "Abstract shape";
        shape.color = "black";
        System.out.println("Shape is created with name " + shape.name);

        Shape anotherShape = new Shape("PrettyShape", "green", 42);
        System.out.println("Shape is created with name " + anotherShape.name);
        anotherShape.greeting();
    }
}
