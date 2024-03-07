package com.gmail.onishchenko.homework;

public class FitnessTrekker {
    private static final int CURRENT_YEAR = 2024;
    private final String name;
    private final int birthDay;
    private final int birthMonth;
    private final int birthYear;
    private final String email;
    private final String phone;
    private String surname;
    private double weight;
    private String pressure;
    private int steps;
    private int age;

    public FitnessTrekker(String name, String surname, int birthDay, int birthMonth, int birthYear, String email, String phone, double weight, String pressure, int steps) {
        this.name = name;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.email = email;
        this.phone = phone;
        this.surname = surname;
        this.weight = weight;
        this.pressure = pressure;
        this.steps = steps;
        this.age = CURRENT_YEAR - this.birthYear;
    }

    public String getName() {
        return name;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public int getSteps() {
        return steps;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    public int getAge() {
        return age;
    }

    public void printAccountInfo() {
        System.out.println("FitnessTrekker{" +
                "name='" + name + '\'' +
                ", birthDay=" + birthDay +
                ", birthMonth=" + birthMonth +
                ", birthYear=" + birthYear +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", surname='" + surname + '\'' +
                ", weight=" + weight +
                ", pressure='" + pressure + '\'' +
                ", steps=" + steps +
                ", age=" + age +
                '}');
    }
}

class FitnessTrekkerRunner {
    public static void main(String[] args) {
        FitnessTrekker[] fitnessTrekkers = {
                new FitnessTrekker("Will",
                        "Smith",
                        25,
                        9,
                        1968,
                        "w_smith@gmail.com",
                        "2936729462846",
                        79.5,
                        "120/85",
                        3012),
                new FitnessTrekker("Jackie",
                        "Chan",
                        7,
                        4,
                        1954,
                        "chan.kong-sang@movie.com",
                        "12312412412",
                        64.86,
                        "120/80",
                        15432),
                new FitnessTrekker("Sherlock",
                        "Holmes",
                        6,
                        1,
                        1854,
                        "holmes@detective-agency.uk",
                        "37742123513",
                        90.45,
                        "130/90",
                        4305)};

        System.out.println("\tInitial accounts information");
        printInfo(fitnessTrekkers);

        FitnessTrekker will = fitnessTrekkers[0];
        will.setSurname("Deadshort");
        will.setSteps(11987);
        will.setPressure("140/90");

        FitnessTrekker sherlock = fitnessTrekkers[2];
        sherlock.setWeight(82.65);
        sherlock.setSteps(4306);

        System.out.println();
        System.out.println("\tAccounts information after changing");
        printInfo(fitnessTrekkers);

    }

    private static void printInfo(FitnessTrekker[] fitnessTrekkers) {
        for (FitnessTrekker fitnessTrekker : fitnessTrekkers) {
            fitnessTrekker.printAccountInfo();
        }
    }
}