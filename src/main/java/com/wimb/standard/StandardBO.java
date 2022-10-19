package com.wimb.standard;

import java.util.Date;
import java.util.Objects;

public class StandardBO {

    private String name;

    private int age;

    public StandardBO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        int sum = 0;
        long currentTime = new Date().getTime();
        for (int i = 0; i < 1000000000; i++) {
            sum += i;
        }
        long stopTime = new Date().getTime();
        System.out.println(stopTime - currentTime);
    }

}
