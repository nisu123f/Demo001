package com.learn.d;


/**
 * @author admin
 * @create 2020/10/26
 */
public class FuncTest {
    static void printLines(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
//        printLines("-");
//        System.out.println(Math.sqrt(5));
//
//        System.out.println(accumulate(2));
//        //010 是 8
//        System.out.println(weiShu(010));
//
//        System.out.println("阶乘和: " + factorialSum(999));
        factor(220);
        System.out.println();
        qinmishu();
        geBaHe();
    }

    static int add(int a, int b) {
        return a + b;
    }

    static void factor(int n) {
        System.out.print(n + "的因子有: ");
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                System.out.print(i + "\t");
            }
        }
//        System.out.println(n);
    }

    static int accumulate(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    static void printHelloWorld(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("HelloWorld");
        }
    }

    static int weiShu(int n) {
        if (n == 0) {
            return 1;
        }

        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;

    }

    static int weiShu1(int n) {

        int count = 1;
        while (n >= 10) {
            n /= 10;
            count++;
        }
        return count;

    }


    static int factorialSum(int n) {
        int a = n / 100;
        int b = n / 10 % 10;
        int c = n % 10;
        return factorial(a) + factorial(b) + factorial(c);
    }

    static int factorial(int n) {
        if (n == 0) {
            return 0;
        }
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    static void qinmishu() {
        for (int a = 1; a <= 3000; a++) {
            int aSum = yinzihe(a);
            //假设a的因子和 == b
            int bSum = yinzihe(aSum);
            //a > aSum  可以去重并限制 b(aSum)的大小
            if (a == bSum && a > aSum) {
                System.out.println(a + " -- " + aSum);
            }
        }
    }

    static int yinzihe(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    static void geBaHe() {
        int n = 14;
        if (n % 2 == 0 && n > 6) {
            System.out.println("输出结果:");
            for (int i = 2; i <= n / 2; i++) {
                if (isZhiShu(i) && isZhiShu(n - i)) {
                    System.out.println("\t" + n + " = " + i + " + " + (n - i));
                }
            }
        } else {
            System.out.println("输入数据有误");
        }


    }

    static boolean isZhiShu(int n) {
        //1不是质数也不是合数
        if (n == 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;


    }

    /*
     * B
     * C
     * D
     * C
     * 正确
     * 1 3
     *
     * */

}
