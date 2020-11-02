package com.learn.g;

import java.util.Arrays;

/**
 * @author admin
 * @create 2020/10/19
 */
public class SortTest {
    public static void main(String[] args) {
//        int[] a = new int[]{3, 6, 9, 7, 5, 4, 1, 8, 0, 9};
        int[] a = new int[]{3};
        Quicksort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }
/*
    	0 1 2 3 4 5 6 7 8 9     i   j

        3 6 2 7 5 4 1 8 0 9     0   9
        9 6 2 7 5 4 1 8 0 _     a[0]=a[9]

        9 6 2 7 5 4 1 8 0 _     1   9
        9 6 2 7 5 4 1 8 0 _     a[0]=a[9]

        9 6 2 7 5 4 1 8 0 _     2   9
        9 6 _ 7 5 4 1 8 0 2     a[9]=a[2]

        9 6 _ 7 5 4 1 8 0 2     2   8

        9 6 _ 7 5 4 1 8 0 2     2   7
        9 6 8 7 5 4 1 _ 0 2     a[2]=a[7]

        9 6 8 7 5 4 1 _ 0 2     3   7
        9 6 8 7 5 4 1 _ 0 2     4   7
        9 6 8 7 5 4 1 _ 0 2     5   7
        9 6 8 7 5 4 1 _ 0 2     6   7
        9 6 8 7 5 4 _ 1 0 2     a[7]=a[6]
        9 6 8 7 5 4 _ 1 0 2     6   6
        9 6 8 7 5 4 [3] 1 0 2     6   6



        ..................
        */


    static void Quicksort(int[] a, int start, int end) {

        /*
        * 递归跳出条件
        * start>end发生情形  1 2 [3]  右侧不需要再排序的情形
        *  |-- 此时i=2 右侧想排序 start=i+1=3 end=2  start>end了
        * start>end发生情形  [3] 4 5 左侧不需要再排序的情形
         * |-- 此时i=0 左侧想排序 start=0 end=i-1=-1  start>end了
         * start=end   ????
        * */
        if (start >= end) {
            return;
        }
        //定义哨兵和 记录"国界"
        //[ i ->    ---------------   <- j  ]
        int i = start;
        int j = end;
        int value = a[start];

        //两个哨兵未相遇
        while (i < j) {
            //start (i)处有个坑,故j先动
            //如果两哨兵没有相遇,且所在的值都比value大(是本国人),一直往左走
            while (i < j && a[j] >= value) {
                j--;
            }
            //停下来,且不是因为遇到另一个哨兵,也就是因为所在的值都比value小(碰到外国人)
            if (i < j) {
                //把外国人赶到"坑"里
                a[i] = a[j];
                //自己这有个坑,让i哨兵往右走,填自己的坑
                i++;
            }
            //同上j哨兵操作往右走
            while (i < j && a[i] <= value) {
                i++;
            }
            //停下来(不是因为两哨兵相遇)
            if (i < j) {
                a[j] = a[i];
                //再换j哨兵往左走
                j--;
            }
            //如果哨兵一直没有相遇,循环进行上述操作.
        }
        //经上,两国就位,此时空出"国界",将value填上"中间"的坑
        //i == j
        a[i] = value;

        //以上 -> 9 6 8 7 5 4 [3] 1 0 2     6   6
        //排序 a[]  start, i-1
        Quicksort(a, start, i - 1);
        //排序 a[]  i+1, end
        Quicksort(a, i + 1, end);
    }


}
