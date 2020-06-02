package ru.geekbrains.javaone.lesson_e.online.zoo;

import ru.geekbrains.javaone.lesson_e.online.Animal;

public class Dog extends Animal {

    public Dog(String name, String color) {
        super(name, color);
    }

    @Override
    protected void voice() {
        System.out.println(name + " Barks");
    }
}
