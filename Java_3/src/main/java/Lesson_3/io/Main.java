package Lesson_3.io;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
//        File file = new File("123/test.txt");
//
//        System.out.println(file.getPath());
//        System.out.println(file.getAbsolutePath());

//        File file2 = new File("123/test1.txt");
//
//        if (file2.exists()) {
//            throw new IOException("file exists");
//        }
//
//        boolean res = file.renameTo(file2);


       // file2.isHidden()

      //  file.createNewFile();
        //file.mkdir();


//        String[] names = file.list(new FilenameFilter() {
//            @Override
//            public boolean accept(File dir, String name) {
//                return name.startsWith("1");
//            }
//        });
//
//        for (String o : names) {
//            System.out.println(o);

//        }

//        ArrayList<Character> characters = new ArrayList<>();
//        long t = System.currentTimeMillis();
//        try (FileInputStream in = new FileInputStream("123/2.txt")){
//            //byte[] arr = new byte[512];
//            int x;
//
//            while ((x = in.read()) != -1) {
//                characters.add((char) x);
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println(characters);
//
//        System.out.println();
//        System.out.println(System.currentTimeMillis() - t);


//        long t = System.currentTimeMillis();
//        try (FileInputStream in = new FileInputStream("123/2.txt")){
//            byte[] arr = new byte[512];
//            int x;
//
//            while ((x = in.read(arr)) > 0) {
//                System.out.print(new String(arr, 0, x));
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println();
//        System.out.println(System.currentTimeMillis() - t);

//        try (InputStreamReader isr = new InputStreamReader(new FileInputStream("123/2.txt"), "UTF-8")) {
////            int x;
////            while ((x = isr.read()) != -1) {
////                System.out.print((char) x);
////            }
////        }

//        BufferedReader br = null;
//        FileReader fr = null;
//
//        try {
//            fr = new FileReader("123/2.txt");
//            br = new BufferedReader(fr);
//
//            String currentLine;
//
//            while ((currentLine = br.readLine()) != null) {
//                System.out.println(currentLine);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if (br != null) {
//                br.close();
//            }
//            if (fr != null) {
//                fr.close();
//            }
//        }

//        PipedInputStream in = null;
//        PipedOutputStream out = null;
//
//        in = new PipedInputStream();
//        out = new PipedOutputStream();
//
//        out.connect(in);
//
//
//        for (int i = 0; i < 100; i++) {
//            out.write(i);
//        }
//
//        int x;
//
//        while ((x = in.read()) != -1) {
//            System.out.print(x + " ");
//        }
//
//        in.close();
//        out.close();

//        ArrayList<InputStream> ali = new ArrayList<>();
//        ali.add(new FileInputStream("123/2.txt"));
//        ali.add(new FileInputStream("123/test1.txt"));
//        ali.add(new FileInputStream("123/test2.txt"));
//
//        SequenceInputStream in = new SequenceInputStream(Collections.enumeration(ali));
//
//        int x;
//
//        while ((x = in.read()) != -1) {
//            System.out.print((char)x);
//        }
//
//        in.close();


//        try (RandomAccessFile raf = new RandomAccessFile("123/2.txt", "r")) {
//            raf.seek(2);
//            System.out.println((char) raf.read());
//            raf.seek(0);
//            System.out.println((char) raf.read());
//        }

    }
}
