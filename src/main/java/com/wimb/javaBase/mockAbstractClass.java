package com.wimb.javaBase;

public abstract class mockAbstractClass {
    // 1.抽象类可有构造函数
    mockAbstractClass(){}
    // 2.抽象类可有抽象方法和具体方法
    // 3.抽象类成员修饰符不能是private，因为要后续被重写
    public abstract int mockMethod1(int a);
    public int mockMethod2(int b){
        return 1;
    }
}
