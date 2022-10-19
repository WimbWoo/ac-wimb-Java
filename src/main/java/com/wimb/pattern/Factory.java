package com.wimb.pattern;

/**
 * @Author: meng.wu01
 * @DateTime: 2021/8/15
 */
public class Factory {
    public static void getCarByName(String name) {
        Car instance = null;
        if (name.equals("aodi")) {
            instance = new Aodi();
        } else {
            instance = new Bniz();
        }
        instance.run();
    }

    public static void main(String[] args) {
        Factory.getCarByName("aodi");
    }
}

interface Car {
    public void run();
}

class Aodi implements Car {

    @Override
    public void run() {
        System.out.println("aodi");
    }
}

class Bniz implements Car {

    @Override
    public void run() {
        System.out.println("bniz");
    }
}