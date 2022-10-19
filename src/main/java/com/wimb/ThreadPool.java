package com.wimb;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author: meng.wu01
 * @DateTime: 2021/11/4
 */
public class ThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        });

    }
}
