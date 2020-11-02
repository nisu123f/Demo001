package com.learn.d;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * List -
 * ArrayList - List接口的实现类,线程不安全,效率高,底层使用Object[] elementData存储
 * LinkedList - 底层使用 双向链表 存储,常用于频繁插入、删除
 * Vector - List接口的古老实现类,线程安全的,效率低,底层使用Object[] elementData存储
 * @author admin
 * @create 2020/10/18
 */
public class ListTest {
    /**
     * List 常用方法 - list有索引存在,
     * 比Collection多了依据索引的操作
     */
    @Test
    public void List() {

        //以ArrayList演示

        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(545);
        list.add(123);

        System.out.println(list);

        //add(int index)
        System.out.println("//add(int index)");
        list.add(1,"new");
        System.out.println(list);

        //addAll(int index, Collection c )
        System.out.println("//addAll(int index, Collection c )");
        list.addAll(4, Arrays.asList(213,45, 45 , "123", new String("wer")));

        System.out.println(list);

        System.out.println("//get(int index)");
        //get(int index)
        System.out.println(list.get(4));

        System.out.println("//indexOf(Object o)");

        //indexOf(Object o)   - 存在返回index,没有则返回-1
        int index = list.indexOf("123");
        System.out.println("index = " + index);

        int index1 = list.indexOf("123q");
        System.out.println("index1 = " + index1);

        //lastIndexIf(Object o)
        System.out.println("//lastIndexIf(Object o)");
        int index2 = list.lastIndexOf("123");
        System.out.println("index2 = " + index2);

        //set(int index, Object o)  - 返回值为index原来的元素数据
        System.out.println("//set(int index, Object o)");
        System.out.println(list);
        Object sdf = list.set(4, "sdf");
        System.out.println(sdf);
        System.out.println(list);


        //subList(int beginIndex, int endIndex)
        List list1 = list.subList(2, 4);

        System.out.println(list1);
    }

    @Test
    public void ArraysListTest() {

        //不建议使用此空参构造器  -- 避免重复扩容
        ArrayList arrayList = new ArrayList();
        //7.0 懒汉?? 在ArrayList创建时就指定了初始容量(长度为10)
        //8.0 饿汉?? 在第一次add()之后创建长度为10的数组,后续操作和7.0相同
        arrayList.add(123);
        arrayList.add(345);
        arrayList.add(3545);

//        for (Object o : arrayList) {
//            System.out.println(o);
//        }
        
        //带参构造器
        ArrayList arrayList1 = new ArrayList(Arrays.asList(123,432,345,65,23));
        for (Object o : arrayList1) {
            System.out.println("o = " + o);
        }

        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        
        Iterator iterator1 =  arrayList.iterator();
        iterator1.next();
        iterator1.remove();

        for (Object o : arrayList) {
            System.out.println("o = " + o);
        }

    }

    @Test
    public void LinkedListTest() {

        // 7.0 和 8.0 一致

    }

    @Test
    public void Vector() {
        //弃子
    }


}
