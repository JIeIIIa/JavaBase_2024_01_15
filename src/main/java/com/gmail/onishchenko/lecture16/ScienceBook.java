package com.gmail.onishchenko.lecture16;

public class ScienceBook {
    private String name;

    public ScienceBook(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{name=" + name + "}";
    }

    public class Page {
        private int number;
        private String name = "default name";

        public Page(int number) {
            this.number = number;
        }

        public void info(int number) {
            System.out.println("I'm a page #" + this.number + " from '" + ScienceBook.this.name + "' book");
        }

        @Override
        public String toString() {
            return "Page{" +
                    "number=" + number +
                    '}';
        }
    }
}
