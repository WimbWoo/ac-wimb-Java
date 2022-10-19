package com.wimb;

import org.springframework.stereotype.Service;

/**
 * @Author: meng.wu01
 * @DateTime: 2021/8/22
 */
@Service
public class AopInterfaceImpl implements AopInterface {

    @Override
    public void say() {
        System.out.println("hallo");
        System.out.println("dev v1");
    }
}
