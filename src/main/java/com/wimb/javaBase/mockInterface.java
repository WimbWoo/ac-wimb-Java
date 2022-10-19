package com.wimb.javaBase;

public interface mockInterface {
    void mockMethod1(int a);
    // 接口中可以有静态方法，但是必须要有方法体实现
    static int mockMethod3(int c) {
        return 0;
    }
}
