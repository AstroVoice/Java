package ru.geekbrains.javaone.lesson_e.online;

import ru.geekbrains.javaone.lesson_e.online.zoo.*;

public class Main {
    public static void main(String[] args) {
        Animal d = new Dog("Sharik", "white");
        Animal b = new Bird("Chijik", "yellow", 10);
        Parrot p = new Parrot("Kesha", "rainbow", 5);
        Animal s = new Snake("Kaa", "brown");

        p.speak();

//        Cat[] arr = {c, d, b};
//        Dog[] ar2 = {c, d, b};
        Animal[] zoo = { new Cat("Barsik", "black"),
                d, b, p, s};
        for (int i = 0; i < zoo.length; i++) {
            zoo[i].walk();
            zoo[i].voice();
            if (zoo[i] instanceof Parrot) {
                ((Parrot) zoo[i]).speak();
            }
        }
    }
}
