package ru.geekbrains.javaone.lesson_e.online.zoo;

import ru.geekbrains.javaone.lesson_e.online.Animal;

public class Cat extends Animal {

    public Cat(String name, String color) {
        super(name, color);
    }

    @Override
    protected void voice() {
        System.out.println("MEOWWWW!!");
    }
}
