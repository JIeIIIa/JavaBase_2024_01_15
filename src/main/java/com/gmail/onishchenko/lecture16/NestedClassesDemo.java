package com.gmail.onishchenko.lecture16;

import com.gmail.onishchenko.lecture16.ScienceBook.Page;

public class NestedClassesDemo {
    public static void main(String[] args) {
        staticNestedClass();
//        ScienceBook book = new ScienceBook("physics");
//        Page page = book.new Page(1);
//        System.out.println(page);
//        page.info(42);
//
//
//
//        class People {
//            private String ticketNumber;
//
//            void demo() {
//                System.out.println("I want a book: " + book);
//            }
//
//            @Override
//            public String toString() {
//                return "People{" +
//                        "ticketNumber='" + ticketNumber + '\'' +
//                        '}';
//            }
//        }

//        book = new ScienceBook("another");

//        People people = new People();
//        System.out.println(people);
//        people.demo();

        class ColoredBook extends ScienceBook {

            public ColoredBook(String name) {
                super(name);
            }

            @Override
            public void info() {
                System.out.print("COLORED BOOK: ");
                super.info();
            }
        }

        ScienceBook coloredBook = new ScienceBook() {
            @Override
            public void info() {
                System.out.println("inside anonymous class");
                ;
            }
        };
        coloredBook.info();

        Info info = () -> System.out.println("describe method implementation");

        info.describe();

    }

    private static void staticNestedClass() {
        Library.Book book = new Library.Book("Pretty book");

        System.out.println(book);
    }
}

interface Info {
    //    void info();
    void describe();
}
