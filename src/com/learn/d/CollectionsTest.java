package com.learn.d;

import org.junit.Test;

import java.util.*;

/**
 * @author admin
 * @create 2020/10/19
 */
public class CollectionsTest {

    /*
    * 排序操作：（均为static方法）
    * reverse(List)：反转 List 中元素的顺序
    * shuffle(List)：对 List 集合元素进行随机排序
    * sort(List)：根据元素的自然顺序对指定 List 集合元素按升序排序
    * sort(List，Comparator)：根据指定的 Comparator 产生的顺序对 List 集合元素进行排序
    * swap(List，int， int)：将指定 list 集合中的 i 处元素和 j 处元素进行交换
    *查找、替换
    * Object max(Collection)：根据元素的自然顺序，返回给定集合中的最大元素
    * Object max(Collection，Comparator)：根据 Comparator 指定的顺序，返回 给定集合中的最大元素
    * Object min(Collection)
    * Object min(Collection，Comparator)
    * int frequency(Collection，Object)：返回指定集合中指定元素的出现次数
    * void copy(List dest,List src)：将src中的内容复制到dest中
    * boolean replaceAll(List list，Object oldVal，Object newVal)：使用新值替换List 对象的所有旧值
    * */

    @Test
    public void test() {
        List list = Arrays.asList("qq","er","43","53","ds","43");

        System.out.println(list);

        //Collections.reverse(list);
        Collections.reverse(list);
        System.out.println(list);

        //shuffle(List)
        Collections.shuffle(list);
        System.out.println(list);

        //sort(List，Comparator)
        Collections.sort(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 != null && o2 != null) {
                    return -o1.toString().compareTo(o2.toString());
                }
                throw new RuntimeException("dsf");
            }
        });
        
        //int frequency(Collection，Object)
        int frequency = Collections.frequency(list, "43");
        System.out.println("frequency = " + frequency);
        int frequency1 = Collections.frequency(list, "4323");
        System.out.println("frequency1 = " + frequency1);

        //Collections.copy(List dest,List src)  将src中的内容复制到dest中
        // -- 易错     dest.size() > src.size()

        List src = Arrays.asList("qq","er","43","53","ds","43");
        
        //下边很巧妙的创建了一个src的size相等的null的dest
        List dest = Arrays.asList(new Object[src.size()]);
        System.out.print(dest + "  -copy()->  ");

        Collections.copy(dest, src);

        System.out.println(dest);


    }
}
