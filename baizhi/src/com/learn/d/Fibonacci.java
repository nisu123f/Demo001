package com.learn.d;

import org.junit.Test;

/**
 * @author admin
 * @create 2020/10/30
 */
public class Fibonacci {

    /*
    * 随堂小练习：
    * 1. 斐波那契数列（1,1,2,3,5,8,13,21,34.。。。），给定一个编号n，
         求出n所对应位置上的数， 比如，n=3，求出2 n=4 求出3 n=8 求出21
       要求： 1.使用for循环解决
             2.使用递归解决问题
    * */

    @Test
    public void test () {
        for (int i = 1; i < 10; i++) {
            System.out.print(fbn(i) + "\t");
        }
        System.out.println();

        for (int i = 1; i < 10; i++) {
            System.out.print(fbnFor(i) + "\t");
        }
        System.out.println();
    }

    public static int fbn(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }else {
            return fbn(n-1) + fbn(n-2);
        }
    }


    public static int fbnFor(int n) {
        int a = 1;
        int b = 1;

        for (int i = 3; i <= n; i++) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        return b;
    }


}
