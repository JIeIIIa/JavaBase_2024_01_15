package com.gmail.onishchenko.homework.interfaces;

public class Androids implements Smartphones, LinuxOS {
    @Override
    public void call(String phoneNumber) {
        System.out.println("[ANDROID] Call to " + phoneNumber);
    }

    @Override
    public void sms(String phoneNumber, String message) {
        System.out.println("[ANDROID] Send SMS from to " + phoneNumber + " with message: ");
        System.out.println("[ANDROID] \t\t" +  message);
    }

    @Override
    public void internet() {
        System.out.println("[ANDROID] Run Google Chrome");
    }

    @Override
    public void enableRootMode() {
        System.out.println("[ANDROID] RootMode is enabled");
    }

    @Override
    public void disableRootMode() {
        System.out.println("[ANDROID] RootMode is disabled");
    }
}
