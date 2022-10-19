package com.wimb.annotation;

//测试类什么时候会初始化
public class Demo08_ActiveReference {
    static {
        System.out.println("Main类被加载");
    }
    public static void main(String[] args) throws ClassNotFoundException {
        // 1. 主动调用
//        Son son = new Son();

        // 反射也会产生主动引用
//        Class.forName("com.wimb.annotation.Son");

        //不会产生类的引用的方法
//        System.out.println(Son.b);

//        Son[] array = new Son[5];

        System.out.println(Son.a);
    }
}

class Father {
    static final int b = 2;
    static {
        System.out.println("父类被加载");
    }
}
class Son extends Father {
    static {
        System.out.println("子类被加载");
        m = 100;
    }
    static int m = 300;
    static final int a = 1;
}
