package Lesson_7;

import java.net.URL;
import java.net.URLClassLoader;
import java.io.*;

public class CheckDZ {
    public static void check() throws Exception {
        File file = new File("path");
        String[] str = file.list();

        for (String  o : str) {
            String[] mass = o.split("\\.");
            if (!mass[1].equalsIgnoreCase("class")) {
                throw new RuntimeException(o, new Exception());
            }

            Class ch = URLClassLoader.newInstance(new URL[] {file.toURL()}).loadClass(mass[0]);
            //Constructor
        }
    }
}
