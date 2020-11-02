package com.learn.e;

import org.junit.Test;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author admin
 * @create 2020/10/18
 */
public class TreeTest {
    public static void main(String[] args) {

        TreeSet<Employee> treeSet = new TreeSet<Employee>();

        treeSet.add(new Employee("Tom", 18, new MyDate(2002, 2, 29)));
        treeSet.add(new Employee("Jim", 19, new MyDate(2001, 3, 29)));
        treeSet.add(new Employee("Acm", 18, new MyDate(2002, 1, 12)));
        treeSet.add(new Employee("Mon", 14, new MyDate(2006, 2, 29)));
        treeSet.add(new Employee("Jim", 20, new MyDate(2001, 3, 29)));
        // Employee按name排序 则Jim重复,只添加一次
//        for (Object o : treeSet) {
//            System.out.println("o = " + o);
//        }
//        for (Employee employee : treeSet) {
//            System.out.println("employee = " + employee);
//        }


        Comparator<Employee> comparator = new Comparator<Employee>() {

            /*
             * 按 生日日期排序
             * */
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.getBirthday().compareTo(e2.getBirthday());
            }
        };

        TreeSet<Employee> treeSetComparator = new TreeSet<Employee>(comparator);

        treeSetComparator.add(new Employee("Tom", 18, new MyDate(2002, 2, 29)));
        treeSetComparator.add(new Employee("Jim", 19, new MyDate(2001, 3, 29)));
        treeSetComparator.add(new Employee("Acm", 18, new MyDate(2002, 1, 12)));
        treeSetComparator.add(new Employee("Mon", 14, new MyDate(2006, 2, 29)));
        treeSetComparator.add(new Employee("Jim", 20, new MyDate(2001, 3, 29)));

        treeSetComparator.forEach(System.out::println);


    }

    @Test
    public void test1() {
        Comparator<Employee> comparator = new Comparator<Employee>() {

            /*
             * 按 生日日期排序
             * */
            @Override
            public int compare(Employee e1, Employee e2) {
                return -e1.getBirthday().compareTo(e2.getBirthday());
            }
        };

        TreeSet<Employee> treeSetComparator = new TreeSet<Employee>(comparator);

        treeSetComparator.add(new Employee("Tom", 18, new MyDate(2002, 2, 29)));
        treeSetComparator.add(new Employee("Jim", 19, new MyDate(2001, 3, 29)));
        treeSetComparator.add(new Employee("Acm", 18, new MyDate(2002, 1, 12)));
        treeSetComparator.add(new Employee("Mon", 14, new MyDate(2006, 2, 29)));
        treeSetComparator.add(new Employee("Jim", 20, new MyDate(2001, 3, 29)));

        for (Employee employee : treeSetComparator) {
            System.out.println("employee = " + employee);
        }
    }
}
