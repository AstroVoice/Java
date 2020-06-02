package ru.geekbrains.javaone.lesson_e.online.zoo;

import ru.geekbrains.javaone.lesson_e.online.Animal;

public class Bird extends Animal {

    private int height;

    public Bird(String name, String color, int height) {
        super(name, color);
        this.height = height;
    }

    @Override
    protected void voice() {
        System.out.println(name + " tweets");
    }
}
