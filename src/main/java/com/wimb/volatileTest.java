package com.wimb;

/**
 * @Author: meng.wu01
 * @DateTime: 2021/11/1
 */
public class volatileTest {

    public static volatile int s = 0;
    static class statisPlus implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 10000; i++) {
                s++;
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Thread []threads = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(new statisPlus());
            threads[i].start();
        }

        for (int i = 0; i < 10; i++) {
            threads[i].join();
        }

        System.out.println(s);

        new Thread();
    }
    // Test:Synchronized
    class A implements Runnable {

        @Override
        public void run() {
            synchronized (A.class) {
                s++;
            }
        }

    }
}
