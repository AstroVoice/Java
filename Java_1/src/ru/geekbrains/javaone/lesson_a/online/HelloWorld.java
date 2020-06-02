package ru.geekbrains.javaone.lesson_a.online;

import ru.geekbrains.javaone.lesson_d.online.Cat;

/*
* Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат с
* плавающей точкой, где a, b, c, d – целочисленные входные параметры этого метода;
*
* Написать метод, принимающий на вход два целых числа, и проверяющий что их сумма лежит
* в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
*
* Написать метод, которому в качестве параметра передается целое число, метод должен
* проверить положительное ли число передали, или отрицательное.
* Замечание: ноль считаем положительным числом. Результат работы метода вывести в консоль
*
* Написать метод, которому в качестве параметра передается строка, обозначающая имя,
* метод должен вернуть приветственное сообщение «Привет, переданное_имя!»; Вывести
* приветствие в консоль.
*
* * Написать метод, который определяет является ли год високосным. Каждый 4-й год
* является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
* Для проверки работы вывести результаты работы метода в консоль
*
* */
public /*don't use this*/ class HelloWorld { //this is a comment
    // one line comment

    private static int add(int a, int b) {
        return a + b;
    }

    private static float add(float a, float b) {
        return 1.0f;
    }

    private static void add() {
        System.out.println("add");
    }

    void hello() {
        System.out.println("Hello!");
    }

    public static void main(String[] args) {
        //vars();
        //arithmetic();
        //comparsions();

        add();
        float i = add(5f, 10f);
        System.out.println(i);
    }

    private static void comparsions() {
        // < > == != <= >=

        int width = 10;
        int height = 10;
        int x = -5;
        int y = 13;

        if (x < 0) {
            System.out.println("x is negative");
        } else if (x < width) {
            System.out.println("horizontal = ok");
        } else {
            System.out.println("x not ok");
        }

        if (y < height && y >= 0) {
            System.out.println("vertical = ok");
        } else {
            System.out.println("y not ok");
        }
    }

    private static void arithmetic() {
        String s = "Hello";

// + - * /
        int a = 10;
        // /
        int b = 10 / 3;
        long l = 12147000000L;
        System.out.println(b);
        // ++ -- %
        System.out.println(a);
        a++;
        System.out.println(a);
        a--;
        System.out.println(a);
        b = a % 3;
        System.out.println(b);
    }

    private static void vars() {
        System.out.print("Hello World\n");
        System.out.println("Hello world");

        int i = 10;
        char c = 65535;
        char ch = 'A';
        System.out.println(i);
        System.out.println((int) (c + 1));
        System.out.println((int) ch);
    }
}
