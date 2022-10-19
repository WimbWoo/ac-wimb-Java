package com.wimb;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * @Author: meng.wu01
 * @DateTime: 2021/8/31
 */
@Data
@Builder
@AllArgsConstructor
public class User {

    private String name;

    private int age;

    public User() {

    }

    class A {
        private int t;
        A () {

        }
        A(int t) {
            this.t = t;
        }
    }
}
