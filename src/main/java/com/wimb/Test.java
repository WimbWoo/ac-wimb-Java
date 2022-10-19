package com.wimb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * @Author: meng.wu01
 * @DateTime: 2021/10/17
 */
public class Test {
    public static final int a[] = {1,2,3};
    public static void main(String[] args) {
//        new Test().insert(1);
//        Arrays.asList(args).stream().forEach(System.out::println);
//        a[0] = 6;
//        System.out.println(a[0]);

//        Integer i1 = new Integer(1);
//        Integer i2 = new Integer(2);
//        boolean b = i1.compareTo(i2) < 0;
//        System.out.println(b);
//
        ArrayList<Integer> filter = new ArrayList<>();
        filter.add(new Integer("1"));
        // filter 满足条件会过滤出来
        filter.stream().filter(item -> Integer.valueOf(2).equals(item)).forEach(System.out::println);
    }

//    private int [] a = new int[10];
//    private static int index = 0;
//    public void insert(int val) {
//        if (index == a.length) {
//            int sum = 0;
//            for(int i=1;i<a.length;i++) {
//                sum += a[i];
//            }
//            a[0] = sum;
//            index = 1;
//        }
//        index ++;
//        a[index] = val;
//    }
}
