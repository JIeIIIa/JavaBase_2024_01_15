package com.gmail.onishchenko.homework.interfaces;

import java.util.concurrent.ThreadLocalRandom;

public class SmartphoneRunner {
    public static void main(String[] args) {
        Smartphones[] smartphones = {
                new Androids(),
                new Androids(),
                new IPhones(),
                new Androids(),
                new IPhones()
        };

        for (int i = 0; i < smartphones.length; i++) {
            String phoneNumber = String.valueOf(ThreadLocalRandom.current().nextLong(1000000000L, 9999999999L));
            System.out.println("\tWork with smartphone#" + i);
            smartphones[i].call(phoneNumber);
            smartphones[i].sms(phoneNumber, "I tried to call you...");
            smartphones[i].internet();
            System.out.println();
        }

        ((LinuxOS)smartphones[1]).enableRootMode();
        ((LinuxOS)smartphones[3]).disableRootMode();

        ((IOs)smartphones[2]).askSiri("To be or not to be?");
        cast(smartphones);
    }

    public static void cast(Smartphones[] smartphones) {
        ((LinuxOS)smartphones[2]).disableRootMode();
    }
}
