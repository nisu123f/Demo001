package com.learn.d;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.function.Consumer;

/**
 * @author admin
 * @create 2020/10/17
 */
public class ForEachTest {
    @Test
    public void test1() {
        //创建 集合
        Collection coll = new ArrayList();
        coll.add("AA");
        coll.add("BB");
        coll.add(1);
        coll.add(new Date());

        /*
         * 增强for循环
         * 快捷键  iter
         * 底层仍然调用iterator
         *   增强for循环是 去除arr1中的值 赋给新变量 s ,
         *   故对 s 中的修改 不影响 arr1 中的值
         *   也就是说 增强for循环中,一般不做修改操作.
         */
        for (Object obj : coll) {
            System.out.println(obj);
        }
        coll.forEach(new Consumer() {
            @Override
            public void accept(Object o) {

            }
        });
        //用于数组
        int[] ints = {1, 2, 4, 5, 7};
        for (int anInt : ints) {
            System.out.println("anInt = " + anInt);
        }

        //练习题 ***
        //1.   成功修改
        String[] arr = new String[]{"AA", "AA", "AA"};

        for (int i = 0; i < arr.length; i++) {
            arr[i] = "BB";
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[i] = " + arr[i]);
        }
        
        
        //2.   没有修改
        String[] arr1 = new String[]{"AA", "AA", "AA"};

        //增强for循环是 去除arr1中的值 赋给新变量 s ,
        //  故对 s 中的修改 不影响 arr1 中的值
        //   也就是说 增强for循环中,一般不做修改操作.
        for (String s : arr1) {
            s = "CC";
        }

        for (String s : arr1) {
            System.out.println("s = " + s);
        }

    }
}
