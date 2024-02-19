package com.gmail.onishchenko.homework;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Lottery {
    public static void main(String[] args) {
        int[] ticket = generate();
        int[] userTicket = generate();

        System.out.println("Ticket: " + Arrays.toString(ticket));
        System.out.println("User ticket: " + Arrays.toString(userTicket));

        Arrays.sort(ticket);
        Arrays.sort(userTicket);
        System.out.println("Ticket (after sort): " + Arrays.toString(ticket));
        System.out.println("User ticket (after sort): " + Arrays.toString(userTicket));

        System.out.println("Result: " + calculateResult(ticket, userTicket));
    }

    public static int[] generate() {
        int[] ticket = new int[7];
        for (int i = 0; i < ticket.length; i++) {
            ticket[i] = ThreadLocalRandom.current().nextInt(10);
        }

        return ticket;
    }

    public static int calculateResult(int[] ticket, int[] userTicket) {
        int result = 0;
        for (int i = 0; i < Math.min(ticket.length, userTicket.length); i++) {
            if (ticket[i] == userTicket[i]) {
                result++;
            }
        }

        return result;
    }

}
