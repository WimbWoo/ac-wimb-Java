package com.wimb;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author: meng.wu01
 * @DateTime: 2021/8/30
 */
public class ThreadTest {

    private static volatile A a;

    public static A getA() {
        if (a != null) {
            return a;
        }
        synchronized (A.class) {
            if(a != null) {
                return a;
            }
            a = new A();
            return a;
        }
    }

    public static void main(String[] args) {

        ExecutorService threadPool = Executors.newFixedThreadPool(2);
        threadPool.execute(()->{
            System.out.println();
        });
//        Collections.sort(1,2,);
//        User user = User.builder().build();
//
//        Class clz = user.getClass();
//
//        System.out.println(clz.isAnnotation());
//
//        System.out.println(2.0-1.1);
//        ArrayList<Integer> list = new ArrayList<>(1);
//
//        new Thread(() -> {
//            while (true) {
//                try {
//                    Thread.sleep(100);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                boolean add = list.add(-1);
//                System.out.println(add);
//            }
//        }).start();
//
//
//        new Thread(() -> {
//            while(true) {
//                for (int i = 0; i < list.size() ; i++) {
//                    System.out.println(list.get(i));
//                }
//            }
//        }).start();
        int aa = 0;
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
//                    assert();
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
        new Thread(() -> {

        });
    }
}

class A {

}
