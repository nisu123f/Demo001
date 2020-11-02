package com.learn.a;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Comparable  Comparator
 * @author admin
 * @create 2020/10/16
 */
public class CompareTest {

    @Test
    public void test1() {
        String[] arr = new String[]{"AA", "CC", "BB", "NN", "LL", "EE", "RR", "DD"};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 实现 Comparable 的类必须实现 compareTo(Object obj) 方法，两个对象即
     * 通过 compareTo(Object obj) 方法的返回值来比较大小。
     * 如果当前对象this大于形参对象obj，则返回正整数，
     * 如果当前对象this小于形参对象obj，则返回负整数，
     * 如果当前对象this等于形参对象obj，则返回零。
     */
    @Test
    public void test2() {
        CompareGoods[] compareGoods = new CompareGoods[5];

        compareGoods[0] = new CompareGoods("phone1", 12.0);
        compareGoods[1] = new CompareGoods("phone2", 62.0);
        compareGoods[2] = new CompareGoods("phone3", 2.0);
        compareGoods[3] = new CompareGoods("phone4", 60.0);
        compareGoods[4] = new CompareGoods("phone5", 60.0);

        Arrays.sort(compareGoods);
        System.out.println(Arrays.toString(compareGoods));
    }


    @Test
    public void test4() {
        CompareGoods[] compareGoods = new CompareGoods[5];

        compareGoods[0] = new CompareGoods("phone1", 12.0);
        compareGoods[1] = new CompareGoods("phone2", 62.0);
        compareGoods[2] = new CompareGoods("phone3", 2.0);
        compareGoods[3] = new CompareGoods("phone4", 60.0);
        compareGoods[4] = new CompareGoods("phone5", 60.0);

        Arrays.sort(compareGoods, new Comparator<CompareGoods>() {
            @Override
            public int compare(CompareGoods o1, CompareGoods o2) {
                if (o1 != null && o2 != null) {
                    return Double.compare(o1.getPrice(), o2.getPrice());
                }
                throw new RuntimeException("参数错误");
            }
        });
        System.out.println(Arrays.toString(compareGoods));
    }

    //Comparator

    @Test
    public void test3() {
        String[] arr = new String[]{"AA", "CC", "BB", "NN", "LL", "EE", "RR", "DD"};

        Arrays.parallelSort(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof String && o2 instanceof String){
                    String s1 = (String)o1;
                    String s2 = (String)o2;
                    return -s1.compareTo(s2);
                }
                throw new RuntimeException("传入参数错误");
            }
        });

        System.out.println(Arrays.toString(arr));
    }
}
