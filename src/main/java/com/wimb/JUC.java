package com.wimb;


import lombok.SneakyThrows;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @Author: meng.wu01
 * @DateTime: 2021/8/45
 */
public class JUC {
    public static void main(String[] args) {
//        Runnable task = new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    Thread.sleep(5000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                Thread t = Thread.currentThread();
//                System.out.println("当前线程:" + t.getName());
//            }
//        };
//        Thread thread = new Thread(task);
//        thread.setName("test-thread-1");
//        thread.setDaemon(true);
//        thread.start();
//
//        ThreadLocal<User> tl = new ThreadLocal<User>();
//        tl.set(new User());

        //1.固定大小，每批次线程执行个数固定为5个
        final ExecutorService executorService = Executors.newFixedThreadPool(5);
        //2.计划任务，返回一个ScheduledExecutorService对象，起到计划任务作用；
        //  可以在指定时间，对任务进行调度；
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(5);
        // 2.1 任务执行5秒，调度周期为2秒。也就是每2秒，任务执行一次，一次执行5秒；
        scheduledExecutorService.scheduleAtFixedRate(new Runnable() {
            @SneakyThrows
            @Override
            public void run() {
                Thread.sleep(5000);
            }
        },0,2, TimeUnit.SECONDS);
        // 2.2 任务执行5秒，每隔任务之间间隔等待2秒
        scheduledExecutorService.scheduleWithFixedDelay(new Runnable() {
            @SneakyThrows
            @Override
            public void run() {
                Thread.sleep(5000);
            }
        },0,2,TimeUnit.SECONDS);

    }
}
