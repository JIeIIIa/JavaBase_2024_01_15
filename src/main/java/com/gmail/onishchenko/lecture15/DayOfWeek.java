package com.gmail.onishchenko.lecture15;

import java.util.Objects;

public class DayOfWeek {
    public static void main(String[] args) {
        DayOfWeek dayOfWeek = new DayOfWeek();
        String result = dayOfWeek.recommendation(Day.MONDAY);

        System.out.printf("Recommendation is '%s'", result);
    }

    public String recommendation(Day day) {
        if (Day.MONDAY.equals(day)) {
            return "go to work!";
        } else {
            return "You may sleep all day)";
        }

    }
}


class Day {
    public static final Day MONDAY = new Day("Monday");
    public static final Day SUNDAY = new Day("Sunday");

    private final String name;

    private Day(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Day day = (Day) o;
        return name != null && name.equalsIgnoreCase(day.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}