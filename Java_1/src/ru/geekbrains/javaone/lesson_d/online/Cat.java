package ru.geekbrains.javaone.lesson_d.online;

public class Cat {
    private String name;
    private String color;
    private int birthYear;

    private static final int pawsCount = 4;

    private Cat() {
        this(1);
        setBirthYear(2019);
    }

    private Cat(int weight) {

    }

    public Cat(String name, String color) {
        this();
        this.name = name;
        this.color = color;
    }

    Cat(String name, String color, int birthYear) {
        this.name = name;
        this.color = color;
        setBirthYear(birthYear);
    }

    private void setBirthYear(int birthYear) {
        // validations
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return 2019 - birthYear;
    }

    private void openMouth() {
        System.out.println(name + "opens mouth!");
    }

    void voice() {
        openMouth();
        System.out.println(name + " meows!");
    }

    void jump() {
        if (getAge() < 3)
            System.out.println(name + " jumps!");
        else
            System.out.println(name + " do not jump");
    }
}
