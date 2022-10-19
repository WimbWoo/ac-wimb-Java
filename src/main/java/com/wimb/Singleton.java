package com.wimb;

/**
 * @Author: meng.wu01
 * @DateTime: 2021/9/8
 */
public class Singleton {

    public static void main(String[] args) {
        System.out.println(getInstance().getClass());
    }

    private static volatile Singleton s;

    public static Singleton getInstance() {
        if (s != null) {
            return s;
        }
        synchronized (Singleton.class) {
            if (s != null) {
                return s;
            }
            s = new Singleton();
            return s;
        }
    }

}
