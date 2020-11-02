package com.learn.d;

import org.junit.Test;

import java.util.*;

/**
 * @author admin
 * @create 2020/10/17
 */
public class CollectionTest {

    @Test
    public void test1() {
        Collection coll = new ArrayList();

        //add(Object o)
        coll.add("AA");
        coll.add("BB");
        coll.add(1);
        coll.add(new Date());


        Collection coll1 = new ArrayList();

        //add(Object o)
        coll1.add("CC");
        coll1.add("DD");
        coll1.add(123);
        coll1.add(new Date());

        //size()   获取元素个数
        System.out.println(coll.size());
        System.out.println(coll);

        //addAll(Collection c)

        coll1.addAll(coll);

        System.out.println(coll1.size());
        System.out.println(coll1);

        //isEmpty()
        System.out.println(coll1.isEmpty());

        //clear()
        coll1.clear();

        System.out.println(coll1);
        System.out.println(coll1.isEmpty());
    }

    @Test
    public void test2() {



        Collection coll = new ArrayList();

        //add(Object o)
        coll.add("AA");
        coll.add("BB");
        coll.add(1);
        coll.add(new Date());

        Collection coll1 = new ArrayList();

        //add(Object o)  -- 返回值 boolean
        coll1.add("CC");
        coll1.add("DD");
        coll1.add(123);
        coll1.add(new Date());
        coll1.add(new String("new String"));

        System.out.println("//contains()");
        //contains()   -- 向Collection接口实现类的对象中添加obj数据时,
                       //要求obj所在类重写equals()

        //true
        System.out.println(coll1.contains(123));
        //false
        System.out.println(coll1.contains("123"));
        //true     -- String 比较的是内容,也就是调用的equals()
        System.out.println(coll1.contains("new String"));
        //true     -- 调用equals(),比较add()中参数 与 contains() 中参数,
                   //第一个add的 比较一次,第二个两次,一次类推...
        System.out.println(coll1.contains(new String("new String")));

        //ContainsAll()
        System.out.println("//ContainsAll()");
        System.out.println(coll1.containsAll(coll));
        System.out.println(coll1.containsAll(Arrays.asList(123)));

        //remove()   -- 也要调用equals()
        System.out.println("//remove()");

        System.out.print(coll1 + " -> ");
        boolean remove = coll1.remove(123);
        System.out.println(coll1);
        System.out.println("remove : " + remove);
        
        //removeAll()    -- 移除共有部分,若所有元素都不存在时,移除失败,返回false,否则完成移除交集返回true
                         // equals方法
        // -- 求差集,删除共有的,并修改当前集合,没有交集时,返回false
        System.out.println("//removeAll()");

        System.out.println(coll1);
        boolean b = coll1.removeAll((Arrays.asList("CC", 456)));
        System.out.println("b = " + b);
        System.out.println(coll1);

        //retainAll()   -- 求交集,并修改当前集合,无交集时仍返回true,并修改当前集合为[] (交集为空),
              //retainAll()中传入的集合包含(">=")当前集合时,返回false,当前集合无修改(交集为当前集合)
        System.out.println("retainAll()");
        System.out.println(coll1);
        System.out.println(coll1.retainAll(Arrays.asList("DD",  "new String")));
        System.out.println(coll1);


        //equals(Object o)     --ArrayList 中 元素的顺序也要保持一致
        System.out.println("//equals(Object o) ");
        System.out.println(coll1.equals(coll1.add(123)));

        //hashCode()
        System.out.println("//hashCode()");
        System.out.println(coll1.hashCode());
        System.out.println(coll.hashCode());

        System.out.println(Arrays.asList(123,"df").hashCode());
        System.out.println(Arrays.asList(213).hashCode());
        System.out.println(Arrays.asList(324).hashCode());

    }

    /**
     * 集合 -> 数组  coll.toArray()
     * 数组 -> 集合  Arrays.asList()
     */

    @Test
    public void test3() {
        //创建 集合
        Collection coll = new ArrayList();
        coll.add("AA");
        coll.add("BB");
        coll.add(1);
        coll.add(new Date());

        //集合 -> 数组
        Object[] objects = coll.toArray();
        //Arrays.toString()  遍历数组
        System.out.println(Arrays.toString(objects));
        
        //数组 ->  集合
        List<Object> objects1 = Arrays.asList(objects);
        System.out.println(objects1);

           //排坑 !!!
        List<int[]> ints = Arrays.asList(new int[]{1, 2, 4, 5, 5, 6});
        //[[I@573fd745]     -- 把int[]当成一个元素放进集合中了
        System.out.println("size= " + ints.size() + "    ints= " + ints);
        // 想要 1, 2, 4, 5, 5, 6 分别放入集合中    -- 重复也没报错??? - List是"动态数组"
        List<Integer> integers = Arrays.asList(1, 2, 4, 5, 5, 6);
        System.out.println("size= " + integers.size() + "    integers= " + integers);
        //或者使用Integer()包装类代替int,如下代码
        List<Integer> integers1 = Arrays.asList(new Integer[]{1, 2, 4, 5, 5, 6});
        System.out.println("size= " + integers1.size() + "    integers1= " + integers1);


        //iterator() : 返回Iterator接口实例,用于遍历集合元素.
        //放在 IteratorTest 中测试

    }
}
