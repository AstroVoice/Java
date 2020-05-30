package Lesson_4;

public class Test {
//    public synchronized void m1() {
//        System.out.println("m1");
//        for (int i = 0; i < 10; i++) {
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//        System.out.println("m2");
//    }

    Object obj = new Object();

    public void m2() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Non sync" + i);
        }

        synchronized (obj) {
            for (int i = 0; i < 3; i++) {
                System.out.println("sync" + i);
            }
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Non sync" + i);
        }
    }
}

class Start {
    public static void main(String[] args) {



        final Test t1 = new Test();
        final Test t2 = new Test();

        new Thread(new Runnable() {
            @Override
            public void run() {
                t1.m2();
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                t1.m2();
            }
        }).start();



    }
}
