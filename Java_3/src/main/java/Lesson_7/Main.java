package Lesson_7;

import Lesson_3.Human;
import Lesson_7.Anon.MyAnon;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.URL;
import java.net.URLClassLoader;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
//        String s = "a";
//        String v = "a";
//        Class c = Cat.class;
//
//        Field[] fields = c.getDeclaredFields();
//
//        for (Field o : fields) {
//            System.out.println(o);
//        }

//        Cat cat = new Cat("Barsik", "White", 2);
//        Class c = Cat.class;
//        cat.infoPublic();
//        Field f = c.getDeclaredField("age");
//        f.setAccessible(true);
//        f.set(cat, 5);
//        cat.infoPublic();

//        Class c = Cat.class;
//        Cat cat = new Cat("Barsik", "White", 2);
//        Method m = c.getDeclaredMethod("infoPrivate");
//        m.setAccessible(true);
//        m.invoke(cat);
//
//        Method m2 = c.getDeclaredMethod("setName", String.class);
//        m2.invoke(cat, "Mursik");
//
//        cat.infoPublic();

//        Class c = Cat.class;
//        Field f = c.getDeclaredField("name");
//        int mods = f.getModifiers();
//
//        if (Modifier.isPrivate(mods)) {
//            System.out.println("field private");
//        }

     //   System.out.println(mods);

        //C:\012345

//        Class ch = URLClassLoader.newInstance(new URL[]
//                {new File("C:/012345").toURL()}).loadClass("Human");
//
//        Constructor constructor = ch.getConstructor(String.class);
//        Object human = constructor.newInstance("Bob");
//        Method m = ch.getDeclaredMethod("info");
//        m.invoke(human);

        Class c = Cat.class;
        Cat cat = new Cat("Barsik", "White", 2);

        Method[] methods = c.getDeclaredMethods();
        for (Method o : methods) {
            if (o.isAnnotationPresent(MyAnon.class)) {
                System.out.println(o.getAnnotation(MyAnon.class).priotity());
                o.invoke(cat);
            }
        }

    }
}
