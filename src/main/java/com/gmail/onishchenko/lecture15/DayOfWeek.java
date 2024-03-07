package com.gmail.onishchenko.lecture15;

public class DayOfWeek {
    public static void main(String[] args) {
        DayOfWeek dayOfWeek = new DayOfWeek();
        Day day = Day.MONDAY;
        String result = dayOfWeek.recommendation(day);

        System.out.printf("Recommendation is '%s'\n", result);
        System.out.println(Day.MONDAY.getName());

        Day anotherDay = Day.valueOf("MONDAY");
        System.out.println(anotherDay);
    }

    public String recommendation(Day day) {
        switch (day) {
            case MONDAY: {

            }
            case SUNDAY: {
                break;
            }
        }
        if (Day.MONDAY.equals(day)) {
            return "go to work!";
        } else {
            return "You may sleep all day)";
        }

    }
}


enum Day {
    MONDAY("Monday"),
    SUNDAY("Sunday"),
    UNKNOWN();

    private final String name;

    Day(String name) {
        this.name = name;
    }

    Day() {
        this.name = "UNKNOWN";
    }

    public String getName() {
        return name;
    }
}