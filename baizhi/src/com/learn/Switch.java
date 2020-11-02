package com.learn;

import org.junit.Test;

/**
 * @author admin
 * @create 2020/10/24
 */
public class Switch {
    @Test
    public void test1() {
        int q = 3;
        //满足当前case且没有break时,执行完当前case,不判断下条case直接执行,直到遇到break.
        //q  为 整形 String 枚举类
        switch (q) {
            case 1:
                System.out.println(1);
                break;
            default:
                System.out.println(0);
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
                break;

        }

//        String s = "";
//        switch (s) {
//            case "123" :
//                System.out.println("123");
//                break;
//            default:
//                System.out.println("default");
//        }
    }
}
