package com.gmail.onishchenko.homework.polymorphism;

public class MusicStylesRunner {
    public static void main(String[] args) {
        MusicStyles[] styles = {
                new RockMusic(),
                new ClassicMusic(),
                new PopMusic(),
                new ClassicMusic(),
                new RockMusic(),
                new RockMusic()
        };

        for (MusicStyles style : styles) {
            style.playMusic();
        }
    }
}
