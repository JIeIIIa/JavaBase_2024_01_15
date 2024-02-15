package com.gmail.onishchenko.lecture10;

public class Shape {
    String name;
    String color;

    public Shape() {
//        name = "Abstract shape";
//        color = "black";
    }

    //
    public Shape(String shapeName) {
        name = shapeName;
        color = "black";
    }
}

class ShapeRunner {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.name = "Abstract shape";
        shape.color = "black";
        System.out.println("Shape is created with name " + shape.name);

        Shape anotherShape = new Shape("PrettyShape");
        System.out.println("Shape is created with name " + anotherShape.name);
    }
}
