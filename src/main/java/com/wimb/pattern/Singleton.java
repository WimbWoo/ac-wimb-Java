package com.wimb.pattern;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;
import lombok.Synchronized;

/**
 * 单例模式
 *
 * @Author: meng.wu01
 * @DateTime: 2021/8/15
 */
public class Singleton {
    private static Singleton singleton;
    private void Singleton(){}
    public static synchronized Singleton getSingleton(){
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}

class Singleton1 {
    private static Singleton1 instance = new Singleton1();
    private Singleton1() {}
    public static Singleton1 getInstance() {
        return instance;
    }
}

// 静态内部类
class Singleton2{
    private static class InnerClass{
        private static final Singleton2 INSTANCE = new Singleton2();
    }
    private Singleton2(){}
    public static final Singleton2 getSingleton2() {
        return InnerClass.INSTANCE;
    }
}


//双重校验锁
class Singleton3{
    private static volatile Singleton3 singleton3;
    private Singleton3(){}
    public static Singleton3 getInstance() {
        if (singleton3 == null) {
            synchronized (Singleton3.class) {
                if (singleton3 == null) {
                    singleton3 = new Singleton3();
                }
            }
        }
        return singleton3;
    }
}