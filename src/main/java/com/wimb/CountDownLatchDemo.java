package com.wimb;

import lombok.SneakyThrows;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author: meng.wu01
 * @DateTime: 2021/11/23
 */
public class CountDownLatchDemo implements Runnable {
    static final CountDownLatch end = new CountDownLatch(10);
    static final CountDownLatchDemo demo = new CountDownLatchDemo();

    @SneakyThrows
    @Override
    public void run() {
        Thread.sleep(new Random().nextInt(10) * 1000);
        System.out.println("check complete!");
        end.countDown();
    }

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            executorService.submit(demo);
        }
        end.await();
        System.out.println("Fire");
        executorService.shutdown();
    }
}
