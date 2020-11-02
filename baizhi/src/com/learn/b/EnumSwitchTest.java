package com.learn.b;

/**
 * @author admin
 * @create 2020/10/24
 */
public class EnumSwitchTest {
    public static void main(String[] args) {
        MyWeek myWeek = MyWeek.getWeek(1);
        switch (myWeek) {
            case Friday:
                System.out.println("friday");
                break;
            case Monday:
                System.out.println("monday");
                break;
            case Sunday:
                System.out.println("sunday");
                break;
            default:
                System.out.println("---");
        }
    }


}
