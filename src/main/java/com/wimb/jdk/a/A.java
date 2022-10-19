package com.wimb.jdk.a;

import com.wimb.CountDownLatchDemo;

import java.net.Inet4Address;
import java.util.HashMap;

/**
 * @Author: meng.wu01
 * @DateTime: 2022/1/23
 */
public class A {
    A () {}

    class B extends A {

    }

    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println(a1 == a2);

        Integer i1 = Integer.valueOf(0);
        Integer i2 = 0;
        System.out.println(i1.hashCode() + "==" + i2.hashCode());
//        Class.forName().newInstance()

        /* ---------------------- */
        String a = "a";
        switch (a) {
            case "a":
                System.out.println(1);
                break;
            case "b":
                System.out.println(2);
                break;
            default:
                System.out.println("null");
        }

        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();

        String s = new String();

    }
}
