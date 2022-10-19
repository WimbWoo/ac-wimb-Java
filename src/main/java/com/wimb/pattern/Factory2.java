package com.wimb.pattern;

/**
 * @Author: meng.wu01
 * @DateTime: 2021/8/15
 */
public class Factory2 {
    public static void main(String[] args) {
        new AudiFactory().createCar();
    }
}

interface Car2 {
    public void run();
}

class Audi2 implements Car2 {

    @Override
    public void run() {
        System.out.println("audi");
    }
}

class Beniz2 implements Car2 {

    @Override
    public void run() {
        System.out.println("Beniz");
    }
}

interface CarFactory {
    Car2 createCar();
}

class AudiFactory implements CarFactory {

    @Override
    public Car2 createCar() {
        return new Audi2();
    }
}

class BenizFactory implements CarFactory {

    @Override
    public Car2 createCar() {
        return new Beniz2();
    }
}