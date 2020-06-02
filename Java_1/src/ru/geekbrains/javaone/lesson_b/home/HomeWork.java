package ru.geekbrains.javaone.lesson_b.home;

public class HomeWork {
    public static void main (String[] args) {
        NumCalc(1,2,3,4);
        compareNum(10,20);
        checkNum(4);
        statement(5);
        hello("Alexander");
        checkYear(8);


        }
        public static void variables(){
        byte b = 127;
        short sh = 31000;
        int i = 2100000000;
        long l = 100000000000000L;
        double db = 1.0;
        float fl = 1.0f;
        char ch = 1;
        boolean bu = true;
        String st = "Text";

        }
        public static int NumCalc(int a, int b, int c, int d){
        return  a * (b+(c/d));
        //        int result = a*(b+(c/d));
        //        return result;
        }
        public static boolean compareNum(int a, int b){
        int sum = a + b;
        return sum <=20 && sum >= 10;
        //        if((a+b)>10&&(a+b)<20){return true;}
        //        return false;
        }
        public static void checkNum(int a){
        if(a >=0){System.out.println("Число положительнгое");}
            System.out.println("Число отрицательное");
        }
        public static boolean statement(int a){
        if (a < 0){return true;};
        return false;
        };
        public static void hello(String name){
            System.out.println("Hello,"+" "+ name);
        }
        public static void checkYear(int year){
            if ((year % 100 != 0 && year % 4 == 0)||(year % 400 == 0)) {
                System.out.println("Високосный");
            }
            else System.out.println("Не високосный");
        }
    }

