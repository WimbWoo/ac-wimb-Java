package com.wimb.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//自定义注解
public class Demo03_CustomAnnotation {
    //注解可以显示赋值,如果没有默认值,就必须给注解赋值
    @MyAnnotation2(name = "张三", age = 10)
    public void test() {
        System.out.println();
    }
}

@Target(value = {ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation2 {
    //注解的参数:参数类型+参数名()
    //String name();
    String name() default "";

    int age() default 0;

    int id() default -1;//-1代表不存在

    String[] schools() default {"西部开源", "清华大学"};
}


