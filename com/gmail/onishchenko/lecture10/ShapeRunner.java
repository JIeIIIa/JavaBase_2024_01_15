package com.gmail.onishchenko.lecture10;

public class ShapeRunner {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.name = "Abstract shape";
        shape.color = "black";
        System.out.println("Shape is created with name " + shape.name);

        Shape anotherShape = new Shape("PrettyShape", "green", 42);
        System.out.println("Shape is created with name " + anotherShape.name);
        anotherShape.greeting();

        System.out.println();
        System.out.println(" -= TRIANGLES =-");
        Triangle triangle = new Triangle("qwerty");
        System.out.println("Shape is created with name " + triangle.name);
        triangle.greeting();

    }
}
