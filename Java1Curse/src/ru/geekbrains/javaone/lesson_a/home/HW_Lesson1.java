package ru.geekbrains.javaone.lesson_a.home;

public class HW_Lesson1 {
    public static void main(String[] args) {
        variables();
        System.out.println(calc01(1,2,3,4));;
        System.out.println(inRange(1,10)?"Число в диапазоне":"Число не в диапазоне");
        System.out.println(isPositive(10)?"Отрицательное":"Положительное");
        System.out.println(printName("Александр"));
        System.out.println(isLeapYear(2020)?"Високосный":"Не високосный");
    }

    private static void variables() {
        byte b = 127;
        short sh = 32767;
        int i = 2147483647;
        long lo = 9223372036854775807L;
        float fl = 12.12f;
        double dbl = 10.01;
        char chr = 64;
        boolean bln = false;
    }

    private static float calc01(int a, int b, int c, int d) {
        return a * (b + (c * 1f / d));
    }

    private static boolean inRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    private static boolean isPositive(int a) {
        return a < 0;
    }

    private static String printName(String name) {
        return "Привет " + name + " !";
    }
    private static boolean isLeapYear(int year){
        return (year % 4 == 0)&&(year % 100 != 100)||(year % 400 ==0);
    }

}
