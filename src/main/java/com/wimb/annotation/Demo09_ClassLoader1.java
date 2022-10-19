package com.wimb.annotation;

//类加载器
public class Demo09_ClassLoader1 {
    public static void main(String[] args) throws ClassNotFoundException {
        //获取系统类的加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);

        //获取系统类加载器的父类加载器 --> 扩展类加载器    jre1.8.0_91\lib\ext
        ClassLoader parent = systemClassLoader.getParent();
        System.out.println(parent);

        //获取扩展类加载器父类加载器-->根加载器(c/c++)  jre1.8.0_91\lib\rt.jar
        ClassLoader parent1 = parent.getParent();
        System.out.println(parent1);

        //测试当前类是哪个加载器加载的
        ClassLoader classLoader = Class.forName("com.wimb.annotation.Demo09_ClassLoader1").getClassLoader();
        System.out.println(classLoader);

        //测试JDK内置的类是谁加载的
        classLoader = Class.forName("java.lang.Object").getClassLoader();
        System.out.println(classLoader);

        //如何获得系统类加载器可以加载的路径
        System.out.println(System.getProperty("java.class.path"));

        //双亲委派机制  检测安全性 你写的类和跟加载器一样的不会用你写的类
        //java.lang.String -->往上推


        /**
         * D:\Environment\java\jdk1.8.0_91\jre\lib\charsets.jar;
         * D:\Environment\java\jdk1.8.0_91\jre\lib\deploy.jar;
         * D:\Environment\java\jdk1.8.0_91\jre\lib\ext\access-bridge-64.jar;
         * D:\Environment\java\jdk1.8.0_91\jre\lib\ext\cldrdata.jar;
         * D:\Environment\java\jdk1.8.0_91\jre\lib\ext\dnsns.jar;
         * D:\Environment\java\jdk1.8.0_91\jre\lib\ext\jaccess.jar;
         * D:\Environment\java\jdk1.8.0_91\jre\lib\ext\jfxrt.jar;
         * D:\Environment\java\jdk1.8.0_91\jre\lib\ext\localedata.jar;
         * D:\Environment\java\jdk1.8.0_91\jre\lib\ext\nashorn.jar;
         * D:\Environment\java\jdk1.8.0_91\jre\lib\ext\sunec.jar;
         * D:\Environment\java\jdk1.8.0_91\jre\lib\ext\sunjce_provider.jar;
         * D:\Environment\java\jdk1.8.0_91\jre\lib\ext\sunmscapi.jar;
         * D:\Environment\java\jdk1.8.0_91\jre\lib\ext\sunpkcs11.jar;
         * D:\Environment\java\jdk1.8.0_91\jre\lib\ext\zipfs.jar;
         * D:\Environment\java\jdk1.8.0_91\jre\lib\javaws.jar;
         * D:\Environment\java\jdk1.8.0_91\jre\lib\jce.jar;
         * D:\Environment\java\jdk1.8.0_91\jre\lib\jfr.jar;
         * D:\Environment\java\jdk1.8.0_91\jre\lib\jfxswt.jar;
         * D:\Environment\java\jdk1.8.0_91\jre\lib\jsse.jar;
         * D:\Environment\java\jdk1.8.0_91\jre\lib\management-agent.jar;
         * D:\Environment\java\jdk1.8.0_91\jre\lib\plugin.jar;
         * D:\Environment\java\jdk1.8.0_91\jre\lib\resources.jar;
         * D:\Environment\java\jdk1.8.0_91\jre\lib\rt.jar;
         * E:\StudyProject\annotation_reflection\out\production\annotation_reflection;
         * D:\WorkingSoftware\IntelliJ IDEA 2020.3.1\lib\idea_rt.jar
         */
    }
}


