package com.learn.f;

import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.function.BiConsumer;


/**
 * Map: 双列数据 key-value -> y=f(x)
 * 一般使用 hashmap,需要频繁遍历时使用LinkedHashMap
 * TreeMap 则是在排序时使用
 *
 * hashtable 弃子,虽线程安全,但是不考虑使用
 * 其子 property 常用作配置文件使用
 *
 *  currentHashMap : 多线程使用,将数据分块更高效
 *
 *
 * @author admin
 * @create 2020/10/18
 */
public class MapTest {
    @Test
    public void test1() {
        /*
        * 在HashMap和LinkedHashMap中添加的自定义类需要
        * 重写hashCode()和equals()
        * 在TreeMap中添加数据则要重写 compareTo()
        *
        * */
        //添加、删除、修改操作：
        //  Object put(Object key,Object value)：将指定key-value添加到(或修改)当前map对象中
        // ---- key已存在,修改为当前value
        //  void putAll(Map m):将m中的所有key-value对存放到当前map中
        //  Object remove(Object key)：移除指定key的key-value对，并返回value
        //  ---- key不存在时,返回null
        //  void clear()：清空当前map中的所有数据
        //元素查询的操作：
        //  Object get(Object key)：获取指定key对应的value
        //  boolean containsKey(Object key)：是否包含指定的key
        //  boolean containsValue(Object value)：是否包含指定的value
        //  int size()：返回map中key-value对的个数
        //  boolean isEmpty()：判断当前map是否为空
        //  boolean equals(Object obj)：判断当前map和参数对象obj是否相等
        //元视图操作的方法：
        //  Set keySet()：返回所有key构成的Set集合
        //  Collection values()：返回所有value构成的Collection集合
        //  Set entrySet()：返回所有key-value对构成的Set集合
        

            HashMap hashMap = new HashMap();

            hashMap.put("AA", 123);
            hashMap.put("CC", 133);
            hashMap.put("AA", 323);
            hashMap.put("BB", 223);

//            Set set = hashMap.keySet();
//            Iterator iterator = set.iterator();
//
//            while (iterator.hasNext()) {
//                Object key = iterator.next();
//                System.out.println( key + " : " + hashMap.get(key));
//            }

        for (Object o : hashMap.keySet()) {
            System.out.println(o + " = " + hashMap.get(o));
        }

        
        
    }
}


