package com.learn.n;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.SortedMap;

/**
 * @author admin
 * @create 2020/10/29
 */
public class LambdaTest {
    @Test
    public void test1 () {
        Runnable r1 = () -> System.out.println("dado");
        r1.run();
    }


    @Test
    public void test2 () {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(123);
        arrayList.add(342);
        arrayList.add(234);
        arrayList.add(544);
        arrayList.add(45);

        arrayList.forEach(n -> System.out.print(n + "\t"));

//        arrayList.sort(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1.compareTo(o2);
//            }
//        });

        arrayList.sort(Integer :: compareTo);
        arrayList.forEach(n -> System.out.print(n + "\t"));
        System.out.println("****************************");
        arrayList.sort((o1, o2) -> o1.compareTo(o2));
        System.out.println(arrayList);


    }
}
