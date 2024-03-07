package com.gmail.onishchenko.homework;

public class Person {
    private String name;
    private String surname;
    private String city;
    private String phoneNumber;

    public Person(String name, String surname, String city, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.phoneNumber = phoneNumber;
    }

    public String personInfo() {
        return String.format("Calling citizen %s %s from %s at %s", name, surname, city, phoneNumber);
    }
}

class PersonRunner {
    public static void main(String[] args) {
        solve();
        solveWithArrays();
    }

    private static void solve() {
        Person will = new Person("Will", "Smith", "New York", "2936729462846");
        System.out.println(will.personInfo());

        Person jackie = new Person("Jackie", "Chan", "Shanghai", "12312412412");
        System.out.println(jackie.personInfo());

        Person sherlock = new Person("Sherlock", "Holmes", "London", "37742123513");
        System.out.println(sherlock.personInfo());
    }

    private static void solveWithArrays() {
        Person[] persons = {
                new Person("Will", "Smith", "New York", "2936729462846"),
                new Person("Jackie", "Chan", "Shanghai", "12312412412"),
                new Person("Sherlock", "Holmes", "London", "37742123513")
        };
        for (Person person : persons) {
            person.personInfo();
        }
    }
}
