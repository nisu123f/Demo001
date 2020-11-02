package com.learn.e;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author admin
 * @create 2020/11/2
 */
public class ArrayExer {
    public static void main(String[] args) {
//        //1,
        int[] arrays = {1, 5, 5, 6, 7, 7};
//        System.out.printf("%.2f\n", avgArray(arrays));
//
//        //2.
////        grade();
//
//        //3.
//        MaxAndMin(arrays);
//
//        //6.
//        char[] chars = {'a', 'c', 'Z', 'z', '#', '%', '3'};
//        System.out.println(queryLower(chars));
//
//        maxXX();

//        System.out.println(score());

        System.out.println(Arrays.toString(BubbleSort(arrays)));
    }


    /**
     * @param arr
     * @return double avg
     * @Description 1.计算一个 int 类型数组元素的平均值
     * @author nisu
     * @date 15:10 2020/11/2
     */

    static double avgArray(int[] arr) {
        int len = arr.length;
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum += arr[i];
        }
        return sum * 1.0 / len;
    }


    /**
     * @Description 定义一个长度为 5 的数组，用于存储学生的成绩，成绩从键盘输入分别存储到数组中；
     * 要求：(1) 将所有的成绩倒叙打印输出
     * (2) 计算学生的平均成绩
     * (3) 键盘输入一个成绩 s，打印出成绩大于 s 的所有结果
     * @author nisu
     * @date 15:10 2020/11/2
     */

    static void grade() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入5个成绩");
        int[] array = getArr(5);

        //倒序输出
        for (int i = 4; i >= 0; i--) {
            System.out.println(array[i]);
        }

        //平均成绩
        System.out.printf("%.1f\n", avgArray(array));

        //键盘输入一个成绩 s，打印出成绩大于 s 的所有结果
        System.out.println("请输入一个成绩 s，我们将打印出成绩大于 s 的所有结果");
        int s = scanner.nextInt();
        System.out.println("大于" + s + "的成绩有");
        boolean flag = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > s) {
                System.out.println("第" + (i + 1) + "个成绩" + array[i]);
                flag = false;
            }
        }
        if (flag) {
            System.out.println("无数据");
        }
    }

    /**
     * @param arr
     * @Description 获取Max&Min
     * @author nisu
     * @date 15:17 2020/11/2
     */

    static void MaxAndMin(int[] arr) {
        int max = max(arr);
        System.out.println("max = " + max);

        int min = min(arr);
        System.out.println("min = " + min);

    }
    
    static int max(int[] arr) {
        //Max
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    
    static int min(int[] arr) {
        //Min
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }


    /**
     * @param arr
     * @param s
     * @return
     * @Description a，键盘输入一个整数 n，如果 n 在数组中存在，则输出 n 的下标；如果 不存在，则输出”此整数在数组中不存在”。
     * @author nisu
     * @date 15:22 2020/11/2
     */


    static int query(int[] arr, int s) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == s) {
                return i;
            }
        }
        return -1;
    }


    /**
     * @param chars
     * @return
     * @Description 小写字母(97 - 122)的个数
     * @author nisu
     * @date 15:26 2020/11/2
     */

    static int queryLower(char[] chars) {
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (97 <= chars[i] && chars[i] <= 122) {
                count++;
            }
        }
        return count;
    }

    //---能力提升---

    /**
     * @Description swap
     * @param
     * @return
     * @author nisu
     * @date 15:37 2020/11/2
     */
    static void swap(int a, int b) {

    }


    /**
     * @Description
     * @param
     * @return
     * @author nisu
     * @date 15:34 2020/11/2
     */
    static int[] BubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                //从小到大
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j] = arr[j + 1];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    static void maxXX() {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9,10}};
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j++) {
                System.out.println("arr["+ i+ "][" + j +"] = " + arr[i][j]);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("max = " + max);
    }

    static double score() {
        int[] arr = getArr(5);
        int max = max(arr);
        int min = min(arr);
        int sum = sum(arr);

        double avgSco = (sum - max - min) * 1.0 / 3;

        return avgSco;


    }

    static int[] getArr( int n) {
        int[] array = new int[n];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }


}


