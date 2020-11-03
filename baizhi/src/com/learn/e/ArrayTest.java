package com.learn.e;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;


/**
 * @author admin
 * @create 2020/10/31
 */
public class ArrayTest {
    @Test
    public void test1 () {
        int[] arr = {1,2,4,5,6,7,8};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("sum = " + sum);
    }

    @Test
    public void test2 () {
        int[] arr = {1,1,2,3,4,5,6,7,6,1,4,1};
        int[] func = func(arr, 1);


        func2(arr, 1);
    }

    static int[] func(int[] arr, int n) {
        int[] result = new int[arr.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                result[count++] = i;
            }
        }
        return result;
    }

    static void func2(int[] arr, int n) {
        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                System.out.println(i);
                flag = false;
            }
        }
        if (flag) {
            System.out.println("not found");
        }
    }

//    static void func1(int[] arr, int n) {
//
//        IntStream stream = Arrays.stream(arr);
//        stream.filter(i -> arr[i] == n ).forEach(System.out::print);
//    }

    @Test
    public void test5 () {
        Integer[] arrInteger = {1,2,4,5,6,7,8};
        Arrays.sort(arrInteger, (a,b) ->  -Integer.compare(a,b));
        System.out.println(Arrays.toString(arrInteger));
    }

    @Test
    public void test6 () {
//        int[] arr = {1,2,4,5,6,7,8};
//        Arrays.sort(arr, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer a, Integer b) {
//                return Integer.compare(a,b);
//            }
//        });

//        System.out.println(Arrays.toString(arr));
    }

}
