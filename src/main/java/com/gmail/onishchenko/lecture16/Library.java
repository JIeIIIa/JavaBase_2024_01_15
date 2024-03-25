package com.gmail.onishchenko.lecture16;

public class Library {
    public static final String address = "Apple street";

    private String libraryName = "Default name";

    public static class Book {
        private String name;

        public Book(String name) {
            this.name = name;
        }

        public void info() {
            System.out.println("My address: " + address);
//            System.out.println("Library name is " + libraryName);
        }

        @Override
        public String toString() {
            return "Book{name=" + name + "}";
        }
    }
}
