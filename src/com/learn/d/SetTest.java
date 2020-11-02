package com.learn.d;

import com.learn.a.CompareGoods;
import org.junit.Test;
import sun.reflect.generics.tree.Tree;

import java.text.Collator;
import java.util.*;

/**
 * set - 无序、不可重复  -> 数学中的"集合"
 * |--HashSet:  作为Set接口的主要实现类:线程不安全,可以存储null  底层-数组+链表
 * |--LinkedHashSet:  遍历内部数据时,可以按照添加的顺序遍历
 * |--TreeSet:  可以按照添加对象的指定属性,进行排序
 * 红黑树存储结构
 *
 * @author admin
 * @create 2020/10/18
 */
public class SetTest {

    @Test
    public void LinkedHashSet() {
        /*
         * 无序性: 不等于随机性,而是添加数据时不是按照数组的索引递增添加
         * 不可重复性: 不仅调用了equals(),还调用了hashCode()比较了hashCode,两个都相等时才是重复的,
         * 也就是自定义类,仅重写equals() 还是可以添加"重复"的值
         * ****hashCod相同时才会调用equals()   -- 提高效率!!!
         *
         * 具体过程(以向HashSet中添加元素a为例):
         *  先调用元素a的hashCode(),计算a的哈希值,通过此哈希值按照特定的算法计算出a在HashSet底层数组中的存放的位置(索引值)
         *     当此位置上没有元素,直接添加在这个位置上(哈希值不同->元素不同)
         *     当此位置或以链表形式存在的多个元素,则比较此处元素和a的哈希值进行比较:
         *         如果hash值不同,则a以链表的形式添加成功.
         *         如果hash值形同,则调用equals()进行比较:
         *             如果equals()返回true,添加失败
         *             如果equals()返回false,以链表形式添加成功
         *
         * 链表插入方式:  七上八下 7.0尾插法 8.0头插法
         * */
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(Arrays.asList(1, 3, 3, 5, 56));
        // [1, 3, 5, 56] -- 不可重复
        System.out.println(linkedHashSet);


        //HashSet
        System.out.println("//HashSet");

        HashSet hashSet = new HashSet();
        hashSet.add(123);
        hashSet.add(223);
        boolean bool = hashSet.add(123);
        hashSet.add("we");
        hashSet.add("we1");
        hashSet.add("we12");

        System.out.println(bool);
        System.out.println(hashSet);

        //LinkedHashSet
        System.out.println("//LinkedHashSet");

        LinkedHashSet linkedHashSet1 = new LinkedHashSet();
        linkedHashSet1.add("sdf");
        linkedHashSet1.add(123);
        linkedHashSet1.add(223);
        //add() 过程提出相同值
        boolean bool1 = linkedHashSet1.add(123);
        boolean bool2 = linkedHashSet1.add("we");
        linkedHashSet1.add("sdf");

//        System.out.println(bool1);
        System.out.println(bool2);
        System.out.println(linkedHashSet1);


    }

    @Test
    public void TreeSet() {
        //TreeSet只能存储同类型元素
        // 所有的set都能重复

        TreeSet treeSet = new TreeSet();

        treeSet.add(123);
        treeSet.add(432);
        treeSet.add(234);
        treeSet.add(432);

        //以下 ClassCastException 类型异常
//        treeSet.add("432");

        //[123, 234, 432]  默认排序
        System.out.println(treeSet);

        /*
        String类型
         */
        TreeSet treeSet1 = new TreeSet();
        treeSet1.add("abc");
        treeSet1.add("bcd");
        treeSet1.add("aef");
        treeSet1.add("tyu");

        System.out.println("treeSet1 = " + treeSet1);


        /*
        自定义类 User
         */
        TreeSet treeSet2 = new TreeSet();
        treeSet2.add(new User("Tom", 12));
        treeSet2.add(new User("June", 12));
        treeSet2.add(new User("Match", 12));
        treeSet2.add(new User("Kan", 12));
        treeSet2.add(new User("Tom", 12));
        treeSet2.add(new User("Tom", 15));

        System.out.println(treeSet2);
    }

    @Test
    public void treeSetComparor() {
        Comparator comparator = new Comparator() {
            /*
            * 名字相同时,年龄从大到小排序
            * */
            @Override
            public int compare(Object o1, Object o2) {

                if (o1 instanceof User && o2 instanceof User) {
                    User u1 = (User)o1;
                    User u2 = (User)o2;
                    int comp = u1.getName().compareTo(u2.getName());
                    if (comp == 0) {
                        return -u1.getAge().compareTo(u2.getAge());
                    }
                    return comp;
                }
                throw new RuntimeException("传入参数错误");
            }
        };

        TreeSet treeSet3 = new TreeSet(comparator);

        treeSet3.add(new User("Tom", 12));
        treeSet3.add(new User("June", 12));
        treeSet3.add(new User("Match", 12));
        treeSet3.add(new User("Kan", 12));
        treeSet3.add(new User("Tom", 12));
        treeSet3.add(new User("Tom", 15));

        System.out.println("treeSet3 = " + treeSet3);
    }
}

class User implements Comparable {
    private String name;
    private Integer age;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        User user = (User) o;

        if (!name.equals(user.name)) {
            return false;
        }
        return age.equals(user.age);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age.hashCode();
        return result;
    }

    /**
     * 传入o与当前对象进项比较
     *
     * @param o 想要比较的元素
     * @return 0 相同,1 当前对象(this)比较大,-1 o较大
     */
    @Override
    public int compareTo(Object o) {
        //先判断是否"同类"(后期 使用反射)
        if (o instanceof User) {
            //是"同类" 进行向下转型
            User user = (User) o;
            //比较age是否相同,使用Integer.compareTo()方法
            //double/Double 使用对应的封装类方法
            int compare = Integer.compare(this.age, user.age);
            //年龄不同,不是一个对象,直接compare就是返回值
            if (compare != 0) {
                return compare;
            }
            //年龄相同,继续比较 姓名,姓名的比较值作为函数的返回值
            return this.name.compareTo(user.name);
        }
        //不是"同类"抛出异常
        throw new RuntimeException("传入参数有误");
    }


}
