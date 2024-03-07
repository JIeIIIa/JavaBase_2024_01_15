package com.gmail.onishchenko.lecture09;

public class Device {
    String name;
    String imei;
    int weight;


    public static void main(String[] args) {
        Device device = new Device();
        System.out.println("Device created)");
        device.imei = "12345";

        Device anotherDevice = new Device();
        anotherDevice.imei = "qwerty";
        System.out.println("Another device created)");

        device.describe();
        anotherDevice.describe();

//        describe(); // ERROR (!!!)
    }

    public void describe() {
        System.out.println("My imei is " + imei);
    }

}
