package Lesson_7;

import Lesson_7.Anon.MyAnon;

public class Cat {
    String name;
    public String color;
    private int age;

    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    @MyAnon(priotity = 3)
    public void infoPublic1() {
        System.out.println("public MyAnon 1 " + name + " " + color + " " + age);
    }

    @MyAnon
    public void infoPublic2() {
        System.out.println("public MyAnon 2 " + name + " " + color + " " + age);
    }

    @MyAnon(priotity = 6)
    public void infoPublic3() {
        System.out.println("public MyAnon 3 " + name + " " + color + " " + age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
