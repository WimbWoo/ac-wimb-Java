package com.wimb.annotation;

import java.util.ArrayList;
import java.util.List;

// 什么是注解
public class Demo01_Annotation extends Object {
    // @Override就是一个注解
    @Override
    public String toString() {
        return super.toString();
    }

    // @Deprecated不推荐程序员使用,但是可以使用,或者存在更好的更新方式
    @Deprecated
    public static void test() {
        System.out.println("Deprecated");
    }

    // @SuppressWarnings 镇压警告
    @SuppressWarnings("all")
    public void test01(){
        List<String> list = new ArrayList<String>();
    }

    public static void main(String[] args) {
        test();
    }
}

