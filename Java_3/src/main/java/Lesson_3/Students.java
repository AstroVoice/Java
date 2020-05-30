package Lesson_3;

import java.io.Serializable;

public class Students extends Human implements Serializable {
    int id;
    String name;

    Book book;

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Students(int id, String name) {
       // super(1);
        this.id = id;
        this.name = name;
        System.out.println("up!");
        if (this.book == null) {
            this.book = new Book("none");
        }
    }

    public void info() {
        if (book != null) {
            System.out.println(id + " " + name + " " + book.title);
        } else {
            System.out.println(id + " " + name);
        }
    }
}
