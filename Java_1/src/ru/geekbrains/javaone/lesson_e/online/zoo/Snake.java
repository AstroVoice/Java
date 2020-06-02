package ru.geekbrains.javaone.lesson_e.online.zoo;

import ru.geekbrains.javaone.lesson_e.online.Animal;

public class Snake extends Animal {
    public Snake(String name, String color) {
        super(name, color);
    }

    @Override
    protected void voice() {
        System.out.println(name + " shshshshshsh");
    }

    @Override
    protected void walk() {
        System.out.println(name + " crawls");
    }
}
