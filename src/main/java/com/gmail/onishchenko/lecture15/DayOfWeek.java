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

        System.out.println(" -= VALUE OF =-");
        Day[] days = Day.values();
        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i]);
        }

        System.out.println();
        System.out.println();
        System.out.println("Current days");
        for (Day currentDay : days) {
            System.out.println(currentDay);
            System.out.println("name of current day: " + currentDay.name());
            System.out.printf("Index of %s: %d\n", currentDay, currentDay.ordinal());
        }
        System.out.println();
        System.out.println();


        convert();
    }

    private static void convert() {
        System.out.println(" -= Convert from String =-");

        String value = "MONDAY";
        Day result = Day.convertFrom(value);
        System.out.println(result);
        Day resultByValueOF = Day.valueOf(value);
        System.out.println("Result by value of: " + resultByValueOF);
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

    public static Day convertFrom(String value) {
        for (Day day : values()) {
            if (day.name().equalsIgnoreCase(value)) {
                return day;
            }
        }

        return UNKNOWN;
    }


    @Override
    public String toString() {
        return "Day is " + name();
    }
}