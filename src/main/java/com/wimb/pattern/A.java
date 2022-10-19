package com.wimb.pattern;

//import sun.management.snmp.jvminstr.JvmThreadInstanceEntryImpl;

/**
 * @Author: meng.wu01
 * @DateTime: 2021/11/21
 */
public class A {
    private static volatile A a;
    private A(){};
    public synchronized A getInstance() {
        if (a == null) {
            synchronized (A.class) {
                a = new A();
            }
        }
        return a;
    }
//    JvmThreadInstanceEntryImpl.ThreadStateMap
}
