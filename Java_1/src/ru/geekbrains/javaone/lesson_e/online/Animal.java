package ru.geekbrains.javaone.lesson_e.online;

public class Animal {
    protected final String name;
    protected final String color;

    protected Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    protected void voice() {}

    protected void walk() {
        System.out.println(name + " walks on paws!");
    }
}
