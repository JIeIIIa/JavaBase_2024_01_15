package com.gmail.onishchenko.lecture16;

public class QuizDemo {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};

//        System.out.println(array[4]);

        int x = 11;
        if ((x > 10) || ( x < 100)) {
            System.out.println();
        }

        long huge = (long) x;
//        boolean flag = (boolean) x;
//        if( ((boolean) x) || true) {
//            System.out.println("");
//        }

        QuizDemo quizDemo = new QuizDemo();
        System.out.println();
    }
}

class Parent {
    public Parent() {
        System.out.println("1");
    }

    public Parent(String value) {
        System.out.println("2");
    }
}


class Child extends Parent {
    public Child() {
        super("test");
//        this("qwer");
        System.out.println("3");

    }

    public Child(String value) {
        System.out.println(value);
    }
}


class Demo {
    public static void main(String[] args) {
        Child child = new Child();
    }
}
