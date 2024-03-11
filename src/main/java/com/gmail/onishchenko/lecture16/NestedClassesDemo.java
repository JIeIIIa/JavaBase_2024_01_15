package com.gmail.onishchenko.lecture16;

import com.gmail.onishchenko.lecture16.ScienceBook.Page;

public class NestedClassesDemo {
    public static void main(String[] args) {
        staticNestedClass();
        ScienceBook book = new ScienceBook("physics");
        Page page = book.new Page(1);
        System.out.println(page);
        page.info(42);
    }

    private static void staticNestedClass() {
        Library.Book book = new Library.Book("Pretty book");

        System.out.println(book);
    }
}
