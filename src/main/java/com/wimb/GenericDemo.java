package com.wimb;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @Author: meng.wu01
 * @DateTime: 2021/9/7
 */
public class GenericDemo {

    public static void main(String[] args) {
        Demo demo = new Demo();
        Class clazz = demo.getClass();

        System.out.println(clazz.getSuperclass());

        Type type = clazz.getGenericSuperclass();
        System.out.println(type);

        ParameterizedType p = (ParameterizedType) type;
        Class c = (Class) p.getActualTypeArguments()[0];
        System.out.println(c);

    }
    public static class Person<T> {

    }

    public static class Demo extends Person<GenericDemo> {

    }
}
