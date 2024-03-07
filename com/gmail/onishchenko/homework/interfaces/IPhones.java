package com.gmail.onishchenko.homework.interfaces;

public class IPhones implements Smartphones, IOs {
    @Override
    public void call(String phoneNumber) {
        System.out.println("Call from IPhone to " + phoneNumber);
    }

    @Override
    public void sms(String phoneNumber, String message) {
        System.out.println("Send SMS from IPhone to " + phoneNumber + " with message: ");
        System.out.println(message);
    }

    @Override
    public void internet() {
        System.out.println("Run Safari");
    }

    @Override
    public void askSiri(String question) {
        System.out.println("<Siri> The question is '" + question + "'");
        System.out.println("<Siri> Found the answer: 42");
    }
}
