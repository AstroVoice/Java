package Lesson_2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.*;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private static Connection connection;
    private static Statement stmt;
    private static PreparedStatement pstmt;

    private int size;
    int[] array;

    public Main(int size) {
        this.size = 0;
        this.array = new int[size];
    }

    public int fillRandom(int bound) {
        Random rnd = new Random();
        return rnd.nextInt(bound);
    }

    // заполнение массива по умолчанию
    public void add(int number) {
        array[this.size] = number;
        this.size++;
    }

    // удаление элементов по значению, через метод поиска индекса
    public void delete(int number){
        // идем дальше если find нашел в массиве нужный элемент
        if(find(number) != -1) {
            // запрашиваем индекс элемента и удаляем его
            for (int i = find(number); i < this.size - 1; i++) {
                this.array[i] = this.array[i + 1];
            }
            this.size--;
            // проверяем наличие элемента в оставшемся массиве, при наличии в массиве используем рекурсию
            for (int i = 0; i < this.size; i++) {
                if (this.array[i] == number) delete(number);
            }
        }
    }

    // возвращаем индекс элемента в массиве по искомому значению
    public int find(int findNumber) {
        int i;
        for (i = 0; i < this.size; i++) {
            if (this.array[i] == findNumber) return i;
        }
        return -1;
    }

    // выводим массив
    public void info() {
        for (int i = 0; i < this.size; i++) {
            System.out.print(this.array[i] + " ");
        }
        System.out.println();
        System.out.println("Размер массива = " + this.size);
        System.out.println("Элементов удалено = " + (array.length - this.size));
    }


    public static void main(String[] args) throws SQLException {

        new Thread(null, new Runnable() {
            public void run() {
                long time = System.currentTimeMillis();
                Main obj = new Main(50000);
                for (int i = 0; i < obj.array.length; i++) {
                    obj.add(obj.fillRandom(3));
                }
                obj.info();
                obj.delete(0);
                obj.info();
                System.out.println("Время выполнения = " + (System.currentTimeMillis() - time) + " мс.");
            }
        }, "1", 1 << 23).start();



//        try {
//            connect();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

//        String name = "bob1; drop table students";
//
//        String sql = String.format("SELECT id, name, score FROM students" +
//                "where name = '%s'", name);
//
//        ResultSet rs = stmt.executeQuery(sql);
//
//        ResultSetMetaData rsmd = rs.getMetaData();
//
//        for (int i = 1; i < rsmd.getColumnCount(); i++) {
//            System.out.println(rsmd.getColumnName(i) + " " + rsmd.getColumnType(i) + " " + rsmd.getTableName(i));
//        }
//
//        while (rs.next()) {
//            System.out.println(rs.getInt(1) + " " + rs.getString("name") + " " + rs.getString("score"));
//        }

//        int res = stmt.executeUpdate("CREATE TABLE students (" +
//                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
//                "name TEXT," +
//                "score TEXT)");
//
//        System.out.println(res);

//        long t = System.currentTimeMillis();
//
//        connection.setAutoCommit(false);
//
//        for (int i = 0; i < 1000; i++) {
//            stmt.executeUpdate("INSERT INTO students (name, score) VALUES ('unknow', " + i +")");
//        }
//
//        connection.setAutoCommit(true);
//
//        System.out.println(System.currentTimeMillis() - t);


//        pstmt = connection.prepareStatement("INSERT INTO students (name, score)" +
//                "VALUES (?, ?);");
//
//        connection.setAutoCommit(false);
//        for (int i = 0; i < 500; i++) {
//            pstmt.setString(1, "Bob " + i);
//            pstmt.setInt(2, 10 + i);
//            pstmt.addBatch();
//        }
//
//        pstmt.executeBatch();
//
//        connection.setAutoCommit(true);

//        stmt.executeUpdate("INSERT INTO students (name, score) VALUES ('Bob1', 10)");
//        Savepoint sp = connection.setSavepoint();
//        stmt.executeUpdate("INSERT INTO students (name, score) VALUES ('Bob2', 20)");
//        connection.rollback(sp);
//        connection.setAutoCommit(true);
//        stmt.executeUpdate("INSERT INTO students (name, score) VALUES ('Bob3', 30)");
//
//
//        disconnect();

    }

    public static void readFile() throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("D:\\Users\\Artem\\Desktop\\test\\update.txt");
        Scanner scanner = new Scanner(fileInputStream);

        while (scanner.hasNext()) {
            String[] mass = scanner.nextLine().split(" ");
            try {
                updateDB(mass[0], mass[1]);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void updateDB(String id, String newValue) throws SQLException {
        String sql = String.format("UPDATE students SET score = %s where id = %s", newValue, id);
        stmt.executeUpdate(sql);
    }

    public static void connect() throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");
        connection = DriverManager.getConnection("jdbc:sqlite:mainDB.db");
        stmt = connection.createStatement();
    }

    public static void disconnect() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
