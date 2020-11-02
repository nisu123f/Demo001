package com.learn.d;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

/**
 * 迭代器    -- 相当于卖票员,空姐等
 * 两个方法 iterator.hasNext() 和 iterator.next()
 * remove()
 * @author admin
 * @create 2020/10/17
 */
public class IteratorTest {

    @Test
    public void test1() {
        //创建 集合
        Collection coll = new ArrayList();
        coll.add("AA");
        coll.add("BB");
        coll.add(1);
        coll.add(new Date());


        //创建 Iterator 实例
        Iterator iterator = coll.iterator();

        //不推荐此方法 以及 for 方法
        int i = 0;
        while (i < coll.size()) {
            Object next = iterator.next();
            System.out.println("第 " + (i++ +1) + "个元素为" + next);
        }


        // 推荐使用这种方式
        while (iterator.hasNext()) {
            /**
             * iterator.next()
             * 作用
             *    1.指针下移
             *    2.返回下移后得到的元素
             */
            System.out.println(iterator.next());
        }

        System.out.println("//排坑");

        /**
         * 错误分析
         *     1. while 中多执行next(),循环体中会少执行一次,也就少输出一次
         *     2. iterator.next() 超出"边界"时不会返回null,而是抛出
         *     NoSuchElementException异常
         *     3.综上,next()和hasNext() 各司其职,不能随意取代彼此
         */
//        Iterator iterator1 = coll.iterator();
//        while (iterator1.next() != null){
//            System.out.println(iterator1.next());
//        }

        /**
         *胡乱分析
         *    1.Iterator相当于一个售票员
         *    while 中每次造一个iterator且执行hasNext()
         *    相当于检票时每次新招一个售票员(且不给他上一售票员的工作数据)去检票,可想而知,每个售票员只会数"1",
         *    也就循环条件一直满足.
         *    2.循环体中,每次新招一个售票员,然后向后数,就只能输出第一个,且循环输出
         *
         *
         *   官话:
         *      集合对象每次调用iterator()方法时都得到一个全新的迭代器对象,默认游标都在集合的第一个元素之前
         */
//        while (coll.iterator().hasNext()) {
//            System.out.println(coll.iterator().next());
//        }


    }

    /**
     * iterator.remove() --  1.只能在执行过next()之后执行   2.不能连续执行两次remove()
     * 可以理解为 remove() 不能下移指针,这个操作有且只能 next()来执行
     *  iterator.next()方法之前不要使用remove(),否则抛出 IllegalStateException ,因为此时游标在第一个元素之前.
     *  *****集合对象每次调用iterator()方法时都得到一个全新的迭代器对象,默认游标都在集合的第一个元素之前
     */
    @Test
    public void test2() {
        //创建 集合
        Collection coll = new ArrayList();
        coll.add("AA");
        coll.add("BB");
        coll.add(1);
        coll.add(new Date());


        //创建 Iterator 实例

//        Iterator iterator = coll.iterator();
        Iterator iterator2 = coll.iterator();


//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
        iterator2.next();
        iterator2.remove();

        /*
         * 有remove() 执行时
         * 不同的iterator好像不能交叉使用
         * ????????? 否则也抛出 IllegalStateException 异常
         */
        Iterator iterator = coll.iterator();
        while (iterator.hasNext()) {
            Object object = iterator.next();
            if ("AA".equals(object)) {
                iterator.remove();
            }
        }

        Iterator iterator1 = coll.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }


    }
}
