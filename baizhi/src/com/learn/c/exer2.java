package com.learn.c;

import org.junit.Test;

import java.util.Scanner;

/**
 * @author admin
 * @create 2020/10/24
 */
public class exer2 {
    @Test
    public void test1() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);
    }

    @Test
    public void test2() {
        int sum = 0;
        int i = 1;
        while (i <= 100) {
            sum += i++;
        }
        System.out.println("sum = " + sum);
    }

    @Test
    public void test3() {
        int sum = 0;
        for (int i = 2; i <= 100; i += 2) {
            sum += i;
        }
        System.out.println("sum = " + sum);
    }

    @Test
    public void test4() {
        int sum = 0;
        int i = 1;
        while (i <= 100) {
            sum += i;
            i += 2;
        }
        System.out.println("sum = " + sum);
    }

    @Test
    public void test5() {
        int n;
        int factorial = 1;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for (int i = n; i > 0; i--) {
            factorial *= i;
        }
        System.out.println(n + "! = " + factorial);
    }

    @Test
    public void test6() {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                sum += i;
            }
        }
        System.out.println("sum = " + sum);
    }

    @Test
    public void test7() {
        double mon = 10000;
        for (int i = 0; i < 5; i++) {
            mon *= 1 + 0.003;
        }
        System.out.printf("mon = %.2f\n", mon);
    }

    @Test
    public void test8() {
        for (int i = 1000; i < 10000; i++) {
            int ab = i / 100;
            int cd = i % 100;
            if ((ab + cd) * (ab + cd) == i) {
                System.out.println("abcd = " + i);
            }
        }

    }


    @Test
    public void test9() {
        int i = 2313;
        int a = i / 1000;
        System.out.println("a = " + a);
        int b = i / 100 % 10;
        System.out.println("b = " + b);
        int c = i / 10 % 10;
        System.out.println("c = " + c);
        int d = i % 10;
        System.out.println("d = " + d);
    }

    @Test
    public void test10() {
        for (int i = 100; i < 1000; i++) {
            int a = i / 100;
            int b = i / 10 % 10;
            int c = i % 10;
            if (a * a * a + b * b * b + c * c * c == i) {
                System.out.println("abc = " + i);
            }
        }
    }

    @Test
    public void test11() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + i * j + "\t");
            }
            System.out.println();
        }
    }

    @Test
    public void test12() {

        /*
         *
         *
         *
         *
         * */
    }


    @Test
    public void test14() {
        for (int i = 0; i < 34; i++) {
            for (int j = 0; j < 51; j++) {
                int k = 100 - i - j;
                if (k % 3 == 0 && i * 3 + j * 2 + k / 3 == 100) {
                    System.out.println("公鸡 " + i + " 母鸡 " + j + " 小鸡 " + k);
                }
            }
        }
    }

    @Test
    public void test141() {
        //小鸡
        for (int i = 0; i < 100; i += 3) {
            //公鸡
            for (int j = 0; j < 34; j++) {
                //母鸡
                int k = 100 - i - j;
                if ( k >= 0 && k * 2 + j * 3 + i / 3 == 100  ) {
                    System.out.println("公鸡 " + j + " 母鸡 " + k + " 小鸡 " + i);
                }
            }
        }
    }

    @Test
    public void test15() {
        Scanner scanner = new Scanner(System.in);
        int n = 7;
//        n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            //控制每行数字 1 的个数
            for (int j = 0; j < i; j++) {
                System.out.print(1 + "\t");
            }
            //控制每行除 1 以外的数字内容
            for (int j = 1; j <= n - i; j++) {
                System.out.print(j + "\t");
            }
            //换行
            System.out.println();
        }
    }

    @Test
    public void test16() {
        Scanner scanner = new Scanner(System.in);
        int n = 5;
//        n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            //打印 "  "
            for (int j = 0; j < n - i; j++) {
                System.out.print("  ");
            }
            //打印 "* "
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }

    @Test
    public void test17() {

        while (true) {

            System.out.println("***************欢迎进入百知通讯录系统****************\n" +
                    "********1. 查询所有联系人\t\t 2. 根据 id 查询联系人\n" +
                    "********3. 根据 id 修改联系人\t 4. 根据 id 删除联系人\n" +
                    "********5. 添加联系人\t\t 6. 根据姓名查询联系人\n" +
                    "********7. 清空联系人\t\t 8. 退出系统");

            int n;
            Scanner scanner = new Scanner(System.in);
            n = scanner.nextInt();
            if (n == 8) {
                break;
            }
        }

    }

    @Test
    public void test13() {

    }
}
