package ru.geekbrains.javaone.lesson_a.home;

/**
 * (пример Javadoc)
 * Домашняя работа №1.
 * Переменные, примитивы, условия, методы, перегрузка методов
 * Иван Игоревич Овчинников.
 * Создан: 2016.12.13
 * Обновлён: 2017.07.02
 */

public class Main {

    /*
     * Написать метод вычисляющий выражение a * (b + (c / d)) и
     * возвращающий результат, где a,b,c,d – входные параметры этого метода.
     */
    private static float calculate(int a, int b, int c, int d) {
        return a * (b + (c * 1f / d));
    }

    private static float calculate(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    /*
     * Написать метод, принимающий на вход два числа, и проверяющий
     * что их сумма лежит в пределах 10 до 20, если да – вернуть true,
     * в противном случае – false.
     */
    private static boolean checkTwoNumbers(int first, int second) {
        int sum = first + second;
        return sum <= 20 && sum >= 10;
    }

    /*
    * Написать метод, которому в качестве параметра передаётся целое число,
    * метод додлжен напечатать в консоль положительное-ли число передали
    * или отрицательное; Замечание: ноль считаем положительным числом.
    */
    private static boolean isPositive(int variable) {
        return variable >= 0;
    }

    /*
    * Написать метод, которому в качестве параметра передаётся строка,
    * обозначающая имя, метод должен вывести в консоль сообщение "Привет, указанное_имя!"
    */
    private static String welcome(String name) {
        System.out.println("Привет, указанное_имя!");
        System.out.println("Just kidding.");
        return "Привет, " + name + "!";
    }

    /*
     * Написать метод, который определяет является ли год високосным.
     * Каждый 4-й год является високосным, кроме каждого 100-го,
     * при этом каждый 400-й – високосный.
     */
    private static boolean isLeapYear(int year) {
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {

        // Просто созданные переменные
        final int varOne = 1;
        final int varTwo = 2;
        final int varThree = 3;
        final int varFour = 4;

        // Переменные в "венгерской нотации", перед именем переменной
        // строчной буквой обозначен её тип
        final float fOne = 1f;
        final float fTwo = 2f;
        final float fThree = 3f;
        final float fFour = 4.0f;

        System.out.println("Calculation from the first task gives us: " + calculate(varOne, varTwo, varThree, varFour));

        System.out.println("Overloaded method returns: " + calculate(fOne, fTwo, fThree, fFour));

        System.out.println("Does the sum of two given numbers fit the range? " + checkTwoNumbers(1, 15));

        System.out.println("Your number is " + ((isPositive(-5)) ? "positive" : "negative") + "!");

        System.out.println(welcome("Somename"));

        System.out.println("Is the given year leap? " + isLeapYear(0));
    }
}
