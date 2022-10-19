package com.wimb.ElasticJob;

import lombok.SneakyThrows;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @Author: meng.wu01
 * @DateTime: 2021/11/27
 */
public class Thread01 {
    public static void main(String[] args) {
        // way1
//        Runnable r = new Runnable() {
//            @SneakyThrows
//            @Override
//            public void run() {
//                for (;;) {
//                    Thread.sleep(3000);
//                    System.out.println("...");
//                }
//            }
//        };
//        Thread thread = new Thread(r);
//        thread.start();


        //way2:Timer
//        Timer timer = new Timer();
//        timer.schedule(new TimerTask() {
//            @Override
//            public void run() {
//                System.out.println("...");
//            }
//        },1000,2000);

        //way3:way2升级版
        ScheduledExecutorService ser = Executors.newScheduledThreadPool(5);
        ser.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("...");
            }
        },1,2, TimeUnit.SECONDS);

        //way4:Quartz框架 - cron语法
    }
}
