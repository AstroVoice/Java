package ru.geekbrains.javaone.lesson_b.online;

import java.util.Arrays;

public class HelloConstructs {

    private static int power(int base, int sign) {
        int result = 1;
        for (int i = 0; i < sign; i++) {
//            result = result * base;
            result *= base;
        }
        return result;
    }

    private static void pifagor(int[][] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j++) {
                arr[i-1][j-1] = i * j;
            }
            System.out.println();
        }
    }

    private static int[] method1() {
        return new int[10];
    }

    public static void main(String[] args) {
//        System.out.println(power(2, 10));
//        pifagor(10,10);
        int[][] a = new int[10][10];
        pifagor(a);


        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {0, 9, 8, 7}
        };
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    private static void simpleArrays() {
        String[] brr;
        int[] arr = new int[8];
        String str = new String("HelloWorld");

        String s = "HelloWorld";
        int[] arr2 = {1, 2, 3, 4, 5, 6};

        String[] sarr = {"Hello", "Java", "World"};
        System.out.println(sarr[0]);
        brr = sarr;
        brr[1] = "Arrays";
        System.out.println(sarr[1]);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        System.out.println(Arrays.toString(arr2));

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void whileLoops() {
        int i = 0;
        while (i < 10) {
//            System.out.print(i++ + " ");
//            System.out.print(++i + " ");
            System.out.println(i);
            ++i;
        }

        do {
            System.out.println(i);
        } while (i < 10);
    }

    private static void switchCase(int base) {
        String name = "ivan";
        if (name.equals("ivan")) {
            System.out.println("sent to desk 25");
        } else if (name.equals("petr")) {
            System.out.println("sent to desk 15");
        } else if (name.equals("tatyana")) {
            System.out.println("sent to desk 5");
        } else {
            System.out.println("address not found");
        }

        switch (name) {
            case "ivan":
                System.out.println("sent to desk 25");
                break;
            case "petr":
                System.out.println("sent to desk 15");
                break;
            case "tatyana":
                System.out.println("sent to desk 5");
                break;
            default:
                System.out.println("address not found");
        }
    }

    private static void typeCast() {
        short i = 127; //00000000 01111111
        byte b = (byte) i;      //--------
    }

    private static void selection() {
        boolean b = true;
        String str = (b) ? "positive" : "";

        String s;
        if (-5 == 0) {
            s = "pos";
        } else {
            s = "neg";
        }
    }
}
