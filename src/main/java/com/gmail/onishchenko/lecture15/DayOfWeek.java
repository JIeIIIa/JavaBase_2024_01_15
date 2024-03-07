package com.gmail.onishchenko.lecture15;

public class DayOfWeek {
    public static void main(String[] args) {
        DayOfWeek dayOfWeek = new DayOfWeek();
        String result = dayOfWeek.recommendation("QWERTY");

        System.out.printf("Recommendation is '%s'", result);
    }

    public String recommendation(String day) {
        if ("monday".equalsIgnoreCase(day)) {
            return "go to work!";
        } else if ("Sunday".equalsIgnoreCase(day)) {
            return "You may sleep all day)";
        }
        return "unknown day(((";
    }
}
