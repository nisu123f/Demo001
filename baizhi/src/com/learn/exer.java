package com.learn;

import org.junit.Test;

import java.util.Scanner;

/**
 * @author admin
 * @create 2020/10/23
 */
public class exer {

    @Test
    public void test1() {
        //1.不正确

//    int price = ...; // 先计算出原价
        int price = 100; // 先计算出原价
        int realPrice = price * 8 / 10; //再计算出打折之后的价格
        System.out.println("realPrice = " + realPrice);
    }

    @Test
    public void test2() {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        int a, b, c;
        a = n / 100;
        b = n / 10 % 10;
        c = n % 10;

        System.out.println("个位是" + a + "\t十位是" + b + "\t百位是" + c);

    }

    @Test
    public void test3() {
        int a = 12;
        if (a % 2 == 0) {
            System.out.println("a是偶数");
        } else {
            System.out.println("a不是偶数");
        }

    }

    @Test
    public void test4() {
        int m, n;
        m = 12;
        n = 3;
        boolean isFactor = m % n == 0;
        if (isFactor) {
            System.out.println("是");
        }else {
            System.out.println("否");
        }
    }

    @Test
    public void test5() {
        String name = "李华";
        System.out.println("name = " + name);
        int age = 18;
        System.out.println("age = " + age);
        int grade = 59;
        System.out.println("grade = " + grade);
        String address = "地球上永远不会毕业的地方";
        System.out.println("address = " + address);
        String postcode = "12391";
        System.out.println("postcode = " + postcode);

        int a,b,c; a=1; b=3; c=(a+b>3 ? ++a : b++);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
        double s =  (int)6.5/7.5*3;
        System.out.println("s = " + s);
        
    }

    @Test
    public void test6() {
        int a = 5;
        int b = (a++) + (--a) + (++a);
        System.out.println(a);
        System.out.println(b);
    }

    @Test
    public void test7() {
        int a = 4;
        int b = 7;

        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);
    }

    /*
    * 6. 基本数据类型 引用数据类型
    *  基本数据类型:  int short long
    *                      float double
    *                       char
    *                       boolean
    *
    *  引用数据类型:  数组,String,Collection,自定义类 等
    *
    * 7.B  float f = 12.3F;
    * 8.C
    * 9.D
    * 10.  double    2.400000000;
    * 11.  6
    * 12    11    "11"   "11B"
    * 13    D
    * 14    1
    *
    *
    * 15     a   5    6   5    6
    *        b        5   5+5    10+6
    *
    *
    *     6
    *     16
    *
    *
    *
    * 16
    * */
}
