package ru.geekbrains.javaone.lesson_e.online.zoo;

public class Parrot extends Bird {
    public Parrot(String name, String color, int height) {
        super(name, color, height);
    }

    public void speak() {
        System.out.println("Polly wanna cracker!");
    }
}
