package Lesson_5;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.TimerTask;
import java.util.concurrent.*;

import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws Exception {
//        ThreadDemo t1 = new ThreadDemo("t1");
//        ThreadDemo t2 = new ThreadDemo("t2");
//
//        t1.setPriority(2);
//        t2.setPriority(8);
//
//
//        t1.start();
//
//        try {
//            Thread.sleep(100);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        t2.start();

//
//        ExecutorService pool = Executors.newFixedThreadPool(4, new ThreadFactory() {
//            @Override
//            public Thread newThread(Runnable r) {
//                System.out.println("new thread");
//                return new Thread(r);
//            }
//        });
//
//        pool.execute(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println(Thread.currentThread().getName());
//                try {
//                    Thread.sleep(500);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println(1);
//            }
//        });
//
//        pool.execute(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println(Thread.currentThread().getName());
//                try {
//                    Thread.sleep(500);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println(2);
//            }
//        });
//
//        pool.execute(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println(Thread.currentThread().getName());
//                try {
//                    Thread.sleep(500);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println(3);
//            }
//        });
//
//        pool.execute(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println(Thread.currentThread().getName());
//                try {
//                    Thread.sleep(500);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println(4);
//            }
//        });
//
//        pool.execute(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println(Thread.currentThread().getName());
//                try {
//                    Thread.sleep(500);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println(5);
//            }
//        });
//
//        pool.execute(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println(Thread.currentThread().getName());
//                try {
//                    Thread.sleep(500);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println(6);
//            }
//        });
//
//        pool.execute(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println(Thread.currentThread().getName());
//                try {
//                    Thread.sleep(500);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println(7);
//            }
//        });
//
//        pool.shutdownNow();


    //    Random random = new Random();

//        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(2);
//        executorService.scheduleAtFixedRate(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println(new Date() + " start work");
//                try {
//                    Thread.sleep(random.nextInt(1000));
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println(new Date() + " end work");
//            }
//        },0,1000L, TimeUnit.MILLISECONDS );


//        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(2);
//        executorService.scheduleWithFixedDelay(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println(new Date() + " start work");
//                try {
//                    Thread.sleep(random.nextInt(1000));
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println(new Date() + " end work");
//            }
//        },0,1000L, TimeUnit.MILLISECONDS );


//        Calendar calendar = Calendar.getInstance();
//        calendar.set(Calendar.HOUR_OF_DAY, 22);
//        calendar.set(Calendar.MINUTE, 22);
//        calendar.set(Calendar.SECOND, 0);
//
//        Date time = calendar.getTime();
//        Timer timer = new Timer();
//        timer.schedule(new RemindTask(), time);

//        ArrayList<String> str = new ArrayList<>();
//
//        Vector<String> vector = new Vector<>();
//
//        ArrayBlockingQueue<String> abq = new ArrayBlockingQueue<>(10);
//
//
//        Map<String, String> hm = Collections.synchronizedMap(new HashMap<>());
//
//        ConcurrentHashMap<String, String> chm = new ConcurrentHashMap<>();


//        Semaphore semaphore = new Semaphore(4);
//
//        ExecutorService serv = Executors.newFixedThreadPool(10);
//
//        for (int i = 0; i < 10; i++) {
//            serv.execute(new Runnable() {
//                @Override
//                public void run() {
//                    try {
//                        semaphore.acquire();
//                        System.out.println("1");
//                        Thread.sleep(2000);
//                        semaphore.release();
//                        System.out.println("2");
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//
//                }
//            });
//        }
//        serv.shutdown();


//        Thread t1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                CountDownLatch cdl = new CountDownLatch(3);
//
//                for (int i = 0; i < 3; i++) {
//                    int w = i;
//                    new Thread(new Runnable() {
//                        @Override
//                        public void run() {
//                            try {
//                                Thread.sleep(300 * w);
//                            } catch (InterruptedException e) {
//                                e.printStackTrace();
//                            }
//                            System.out.println("стартуем");
//
//                            cdl.countDown();
//
//                            try {
//                                cdl.await();
//                            } catch (InterruptedException e) {
//                                e.printStackTrace();
//                            }
//
//                            System.out.println("продолжаем работу");
//
//                        }
//                    }).start();
//                }
//            }
//        });
//
//        t1.start();
//
//        t1.join();
//
//        System.out.println("END");


        CountDownLatch cdl = new CountDownLatch(2);

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("стартуем");

                cdl.countDown();

                try {
                    cdl.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("продолжаем работу");

            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("стартуем");

                cdl.countDown();

                try {
                    cdl.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("продолжаем работу");

            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();


        System.out.println("END");




//        System.out.println("End!");
//        try {
//            cdl.await();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

//
//        try {
//            cdl.await();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

       // System.out.println("End");


//        CyclicBarrier cb = new CyclicBarrier(10);
//
//        for (int i = 1; i < 21; i++) {
//            int w = i;
//            new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    System.out.println(w + " start");
//
//                    try {
//                        Thread.sleep((int)Math.random() * 3000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println(w + " ready");
//
//                    try {
//                        cb.await();
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    } catch (BrokenBarrierException e) {
//                        e.printStackTrace();
//                    }
//
//                    System.out.println("работа потока после остановки " + Thread.currentThread().getName());
//                }
//            }).start();
//        }

     //   System.out.println("End");


//        AtomicInteger atomicInteger = new AtomicInteger(100);
//
//       Thread t1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                atomicInteger.incrementAndGet();
//            }
//        });
//
//        Thread t2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                atomicInteger.incrementAndGet();
//            }
//        });
//
//        t1.start();
//        t2.start();
//
//        try {
//            t1.join();
//            t2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//
//        System.out.println(atomicInteger);


//        ReentrantLock r1 = new ReentrantLock();
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                r1.lock();
//                System.out.println(1);
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println(2);
//                r1.unlock();
//            }
//        }).start();

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                r1.lock();
//                System.out.println(1);
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println(2);
//                r1.unlock();
//            }
//        }).start();




    }
}

class RemindTask extends TimerTask {

    @Override
    public void run() {
        System.out.println("up!");
    }
}


class ThreadDemo extends Thread {

    String name;

    public ThreadDemo(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name);
    }
}

//    void testSc() {
//        Calendar calendar = Calendar.getInstance();
//        calendar.set(Calendar.HOUR_OF_DAY, 22);
//        calendar.set(Calendar.MINUTE, 13);
//        calendar.set(Calendar.SECOND, 0);
//
//        Date time = calendar.getTime();
//        Timer timer = new Timer();
//        timer.schedule(new RemindTask(), time);
//    }
//}
//
//class RemindTask extends TimerTask {
//
//    @Override
//    public void run() {
//        System.out.println("up!");
//    }
//}