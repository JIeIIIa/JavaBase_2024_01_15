package com.gmail.onishchenko.homework;

import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("A name for the first team: ");
        String policeTeam = scanner.nextLine();
        System.out.println("Player 1 [" + policeTeam + "]: ");
        int firstPolicePlayer = readInt(scanner);
        System.out.println("Player 2 [" + policeTeam + "]: ");
        int secondPolicePlayer = readInt(scanner);
        System.out.println("Player 3 [" + policeTeam + "]: ");
        int thirdPolicePlayer = readInt(scanner);
        System.out.println("Player 4 [" + policeTeam + "]: ");
        int fourthPolicePlayer = readInt(scanner);
        System.out.println("Player 5 [" + policeTeam + "]: ");
        int fifthPolicePlayer = readInt(scanner);
        scanner.nextLine();

        System.out.println("A name for the second team: ");
        String terroristTeam = scanner.nextLine();
        System.out.println("terroristTeam" + terroristTeam);
        System.out.println("Player 1 [" + terroristTeam + "]: ");
        int firstTerroristPlayer = readInt(scanner);
        System.out.println("Player 2 [" + terroristTeam + "]: ");
        int secondTerroristPlayer = readInt(scanner);
        System.out.println("Player 3 [" + terroristTeam + "]: ");
        int thirdTerroristPlayer = readInt(scanner);
        System.out.println("Player 4 [" + terroristTeam + "]: ");
        int fourthTerroristPlayer = readInt(scanner);
        System.out.println("Player 5 [" + terroristTeam + "]: ");
        int fifthTerroristPlayer = readInt(scanner);

        int playersCount = 5;
        double policeAverageScore = (double) (firstPolicePlayer + secondPolicePlayer + thirdPolicePlayer + fourthPolicePlayer
                + fifthPolicePlayer) / playersCount;
        System.out.println(policeTeam + " average score is " + policeAverageScore);
        double terroristAverageScore = (double) (firstTerroristPlayer + secondTerroristPlayer + thirdTerroristPlayer
                + fourthTerroristPlayer + fifthTerroristPlayer) / playersCount;
        System.out.println(terroristTeam + " average score is " + terroristAverageScore);

        double precision = 0.00001;
        if (Math.abs(policeAverageScore - terroristAverageScore) < precision) {
            System.out.println("Draw");
        } else if (policeAverageScore - terroristAverageScore > precision) {
            System.out.println(policeTeam + " won");
        } else {
            System.out.println(terroristTeam + " won");
        }
    }

    public static int readInt(Scanner scanner) {
        while (true) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if (number > 0 && number < 1000) {
                    return number;
                }
            }
            System.out.println("Enter a number between 1 and 999");
            scanner.nextLine();
        }
    }
}
