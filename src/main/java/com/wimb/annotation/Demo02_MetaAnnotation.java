package com.wimb.annotation;

import java.lang.annotation.*;

//测试元注解
@MyAnnotation
public class Demo02_MetaAnnotation {
    @MyAnnotation
    public void test() {

    }
}

//定义一个注解
//@Target可以用在什么地方
//ElementType.METHOD方法上有效  ElementType.TYPE类上有效
@Target(value = {ElementType.METHOD, ElementType.TYPE})
//@Retention在什么地方有效
//RUNTIME > CLASS > SOURCES
@Retention(value = RetentionPolicy.RUNTIME)
//@Documented 表示是否将我们的注解生成在Javadoc中
@Documented
//@Inherited 子类可以继承父类的注解
@Inherited
@interface MyAnnotation { }

