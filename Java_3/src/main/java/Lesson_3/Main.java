package Lesson_3;

import java.io.*;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
//        Students students = new Students(1, "Bob1");
//        Book book = new Book("HP");
//        students.setBook(book);
//        ObjectOutputStream oos =new ObjectOutputStream(new FileOutputStream("stud.ser"));
//        oos.writeObject(students);
//        oos.close();

//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("stud.ser"));
//        Students students = (Students) ois.readObject();
//        ois.close();
////
//        students.info();
    }

    public static void insertTab (String nameTab, String file) throws SQLException, FileNotFoundException {
        Scanner in = new Scanner(new File(file));
        StringBuilder data = new StringBuilder(); // читаем текст
        int i = 0;
        while (in.hasNext()) {
            data.append(in.nextLine()).append("\n"); //разбиваем текст на строки
            String[] arr = data.toString().split(" "); // массив из значений
       //     stmt.execute("INSERT INTO " + nameTab + " (name, score) VALUES ('" + arr[1] + "', '" + arr[2] + "');");
            System.out.println("Данные добавленны");
            i++;
        }

    }
}
