package com.learn.h;

import org.junit.Test;

import java.math.BigInteger;
import java.sql.SQLOutput;

/**
 * @author admin
 * @create 2020/10/19
 */
public class LearnTest {
    @Test
    public void test1() {
        char c = '\\';
        System.out.println(Integer.toBinaryString(c));
        System.out.println(Integer.toHexString(c));

        int a = 11;
        double b = 10.0;

        System.out.println(Integer.toHexString(a));
        System.out.println(Double.toHexString(b));

        BigInteger bgIng = new BigInteger("312374023470124");

        System.out.println(bgIng);
        
        String s = bgIng + " sdf";
        System.out.println("s = " + s);

        Person p = new Person();

        String s1 = p + "sdf";
        System.out.println(s1);

        System.out.println("------------");
        int i = 100003420;
        System.out.println(Integer.toBinaryString(i));

        char i1 = (char) i;
        System.out.println(i1);
        System.out.println(Integer.toBinaryString(i1));

        double d = 11544556485664.213;
        double d1 = 543432456485664.213;
        //111 1110 1100 1010 0001 1000 1000 1100 0010 0000
        //1111111111111111111111111111111
        System.out.println(Double.toHexString(d));
        System.out.println(d);
        int i2 = (int) d;
        int i3 = (int) d1;
        System.out.println("i2 = " + i2);
        System.out.println("i3 = " + i3);
    }

    class Person {
        String name = "123";

    }

}
