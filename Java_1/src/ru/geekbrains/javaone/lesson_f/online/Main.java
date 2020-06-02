package ru.geekbrains.javaone.lesson_f.online;

import java.io.*;
import java.util.Scanner;

public class Main {

    private static float method1(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            e.printStackTrace();
            return 0;
        }
    }

    private static void method2() throws IOException {
        throw new IOException();
    }

    public static void main(String[] args) {

        /*

1.	Создать 2 текстовых файла, примерно по 50-100
символов в каждом(особого значения не имеет);

2.	Написать программу, «склеивающую» эти файлы, то есть вначале идет текст
из первого файла, потом текст из второго.

3.	* Написать программу, которая проверяет присутствует ли указанное
пользователем слово (или словосочетание, или предложение) в файле.
(Работаем только с латиницей)

4.  ** Написать метод, проверяющий, есть ли указанное слово в файлах папки

        * */
        try {
            OutputStream out;
            InputStream in;
            FileOutputStream fout = new FileOutputStream("file.txt", true);
            String msg = "HelloWorld";
            fout.write(msg.getBytes());

            PrintStream ps = new PrintStream(fout);
            ps.println("\nThis is a printStream!");
            ps.close();

            FileInputStream fin = new FileInputStream("file.txt");
            int i;
            while ((i = fin.read()) != -1)
                System.out.print((char) i);

            //Scanner scanner = new Scanner(fin);

        } catch (IOException e)  {
            e.printStackTrace();
        }
    }

    private static void sbSample() {
        long startTime = System.nanoTime();
        String s = "Example";
        for (int i = 0; i < 100000; i++) {
            s += i;
        }
        float deltaTime = (System.nanoTime() - startTime) * 0.000000001f;
        System.out.println("Sec: " + deltaTime);

        startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder("Example");
        for (int i = 0; i < 100000; i++) {
            sb.append(i);
        }
        deltaTime = (System.nanoTime() - startTime) * 0.000000001f;
        System.out.println("Sec: " + deltaTime);

        System.out.println(s.equals(sb.toString()));
    }

    private static void stringSamples() {
        Scanner sc = new Scanner(System.in);
        String s0 = "Hello";
        String s1 = "Hello";
        String s2 = "He";
        String s3 = "llo";
        String s4 = s2 + s3;
        String s5 = sc.next();

        System.out.println(s0 == s1);
        System.out.println(s0 == s4);
        System.out.println(s0 == s5);
        System.out.println(s0.equals(s1));
        System.out.println(s0.equals(s4));
        System.out.println(s0.equals(s5));
    }
}
