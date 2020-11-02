package com.learn.l;

import org.junit.Test;

import java.util.Random;

/**
 * @author admin
 * @create 2020/10/26
 */
public class NewInstance1Test {

    @Test
    public void test1() throws Exception{
        for (int i = 0; i < 100; i++) {

            int num = new Random().nextInt(3);
            String classPath = "";
            switch (num) {
                case 0:
                    classPath = "java.util.Date";
                    break;
                case 1:
                    classPath = "com.learn.l.Persion";
                    break;
                case 2:
                    classPath = "java.lang.Object";
                    break;
                default:
            }
            Object obj = getInstance(classPath);
            System.out.println("obj = " + obj);


        }
    }

    private Object getInstance(String classPath) throws Exception{
        Class<?> aClass = Class.forName(classPath);
        return aClass.newInstance();
    }

    @Test
    public void test4 () {



        //在 s 有值 输出
        String s = null;
        if (s !=null && s.length() != 0 ) {
            System.out.println("true");
        }
        System.out.println(s);
    }
}
