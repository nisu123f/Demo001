package com.learn.c;

import com.sun.javafx.image.BytePixelSetter;
import org.junit.Test;

import java.util.Random;
import java.util.Scanner;

/**
 * @author admin
 * @create 2020/10/24
 */
public class exer1 {
    @Test
    public void test1() {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if (i > 0) {
            System.out.println("+");
        } else {
            System.out.println("-");
        }

    }

    @Test
    public void test2() {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if (i > 50) {
            System.out.println("中老年");
        } else if (i >= 36) {
            System.out.println("中年人");
        } else if (i >= 18) {
            System.out.println("青年");
        } else if (i >= 14) {
            System.out.println("青少年");
        } else if (i >= 6) {
            System.out.println("少儿");
        } else {
            System.out.println("儿童");
        }
    }

    @Test
    public void test3() {
        //“贝贝”、“晶晶”、“欢欢”、“迎迎”和“妮妮”
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        switch (i) {
            case 1:
                System.out.println("贝贝");
                break;

            case 2:
                System.out.println("晶晶");
                break;

            case 3:
                System.out.println("欢欢");
                break;

            case 4:
                System.out.println("迎迎");
                break;

            case 5:
                System.out.println("妮妮");
                break;

            default:
                System.out.println("北京欢迎你");
                break;
        }
    }

    /*
     * 5. B C
     * 6. A C
     * 7. C
     *
     * 8.  15能被3整除!
     *     我不是一个偶数
     *      我只是一个数据
     *
     * 9. default
     *    zero
     *
     *
     *
     *
     * */

    @Test
    public void test10() {
        int n, m;
        Scanner scanner = new Scanner(System.in);
//        n = scanner.nextInt();
//        m = scanner.nextInt();
        n = 13;
        m = 4;
        System.out.println("共 n = " + n + " 条结果，单页显示m=" + m + " 条");
        int count = n % m == 0 ? n / m : n / m + 1;
        int i;
        for (i = 1; i < count; i++) {
            System.out.println("当 i = " + i + " 时，显示第" + ((i - 1) * m + 1) + "  条 到第 " + i * m + "条");
        }
        System.out.println("当 i = " + i + " 时，显示第" + ((i - 1) * m + 1) + "  条 到第 " + n + "条");


    }

    @Test
    public void test11() {
        //应缴税款
        double taxPayable;
        //工资扣保险和3500
        int preTaxIncome;
        //各类保险
        int insurance = 262;
        //税率
        double taxRate;
        //速算扣除数
        int quickDeduction;
        //实发工资
        double income;
        //所有工资
        int salary;
        Scanner scanner = new Scanner(System.in);
        salary = scanner.nextInt();
        preTaxIncome = salary - insurance - 3500;

        if (preTaxIncome > 0) {
            if (preTaxIncome > 80000) {
                taxRate = 0.45;
                quickDeduction = 13505;
            } else if (preTaxIncome > 55001) {
                taxRate = 0.35;
                quickDeduction = 5505;
            } else if (preTaxIncome > 35001) {
                taxRate = 0.30;
                quickDeduction = 2755;
            } else if (preTaxIncome > 9001) {
                taxRate = 0.25;
                quickDeduction = 1005;
            } else if (preTaxIncome > 4501) {
                taxRate = 0.20;
                quickDeduction = 555;
            } else if (preTaxIncome > 1501) {
                taxRate = 0.10;
                quickDeduction = 105;
            } else {
                taxRate = 0.03;
                quickDeduction = 0;
            }

            taxPayable = preTaxIncome * taxRate - quickDeduction;
            income = preTaxIncome - taxPayable - insurance;
            System.out.println("应当缴纳的个人所得税: " + taxPayable + "    税后实际收入: " + income + "。");
        }else {
            System.out.println("不需要交税");
        }


    }

    @Test
    public void test7() {


    }

    @Test
    public void test8() {
        int sum = 0;
        int i = 1;
        while (i <= 100) {
            sum += i++;
        }
        System.out.println(sum);
    }

    @Test
    public void test9() {
        int sum = 0;
        int i = 1;
        while (i <= 100) {
            if (i % 2 == 0) {
                sum += i++;
            }
        }
        System.out.println(sum);
    }

    @Test
    public void guessNumber() {
        Random random = new Random();
        int n = random.nextInt(101);
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        int number;
        while (flag) {
            number = scanner.nextInt();
            if (number > n) {
                System.out.println("猜大了!!!");
            } else if (number < n) {
                System.out.println("猜小了!!!!");
            } else {
                System.out.println("这次猜对了!!!");
                flag = false;
            }
        }
    }

    @Test
    public void test111() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    @Test
    public void test222() {
        System.out.println("***************欢迎进入百知通讯录系统****************\n" +
                "********1. 查询所有联系人\t\t 2. 根据 id 查询联系人\n" +
                "********3. 根据 id 修改联系人\t 4. 根据 id 删除联系人\n" +
                "********5. 添加联系人\t\t 6. 根据姓名查询联系人\n" +
                "********7. 清空联系人\t\t 8. 退出系统");
    }


}
