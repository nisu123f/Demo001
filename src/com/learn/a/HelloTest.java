package com.learn.a;

import org.junit.Test;

import java.util.Arrays;
import java.util.Date;

/**
 * @author admin
 * @create 2020/10/13
 */
public class HelloTest {
    public static void main(String[] args) {
        System.out.println("hello");

        StringBuilder stringBuilder = new StringBuilder("egd");
        stringBuilder.append("aaa");
        System.out.println(stringBuilder.toString());

        String s1 = new String("Hello world");
        boolean he = s1.contains("He");
        System.out.println(he);
    }

    @Test
    public void test1(){
        String s1 = new String("Hello world");
        boolean he = s1.contains("He");
        System.out.println(he);

        String s2 = "he.ds.sfd.sfd";
        String[] split = s2.split("\\.");
        System.out.println(Arrays.toString(split));
        System.out.println("---------------------");
        String s3 = " df   ";
        System.out.println(s3.trim());

        System.out.println(s3.isEmpty());
    }

    @Test
    public void test2(){
        String s1 = new String("abc");
        String s2 = new String("abc");
        String s3 = "abc";
        String s5= "abc";
        String s4 = s3.intern();


        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s5 == s3);
        System.out.println(s1 == s4);
        System.out.println(s3 == s4);

    }

    @Test
    public void test3(){
        final int[] arr = new int[]{1,2,3};
        arr[2]= 0;
        System.out.println(Arrays.toString(arr));
        final int a = 12;
//        a = 12;   xx

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = sb1.append("caaab");
        System.out.println(sb1 == sb2);
        System.out.println(sb2.reverse());
        System.out.println(sb1);
        System.out.println(sb1.capacity());
        System.out.println(sb1.append("asfsdfsdfsdfsadfasdfsdfasdfasdfsda"));
        new StringBuilder(20);
    }

    @Test
    public void test4() {
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println("default cap: " + stringBuilder.capacity());
        stringBuilder.append("1234567812345678");
        stringBuilder.append("1234567812345678");
        stringBuilder.append("123");
        System.out.println(stringBuilder.length());
        System.out.println(stringBuilder.capacity());
    }

    @Test
    public void test5() {
        StringBuilder stringBuilder = new StringBuilder("dafdsfsdfdsf");
        System.out.println(stringBuilder.delete(1, 6));
        System.out.println(stringBuilder.toString());
    }

    @Test
    public void test6() {
        String str = "dsfsdsdf";
        System.out.println(str.getBytes().toString());

        str  =str.substring(3, 6);
        System.out.println(str);
        for (int i = 0; i < 0; i++) {
            System.out.println("sdfsdafsdfasdfsadfasd");
        }

    }



}
