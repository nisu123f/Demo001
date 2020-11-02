package com.learn.l;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author admin
 * @create 2020/10/26
 */
public class ReflectionTest {
    @Test
    public void test() {
        Persion p1 = new Persion("Tom",18);

        p1.getAge();

        p1.play();
    }
    
    @Test
    public void test1() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        //通过反射创建对象
        Class<Persion> persionClass = Persion.class;
        System.out.println(persionClass.getName());
        Constructor<Persion> constructor = persionClass.getConstructor(String.class, Integer.class);

        Persion tom = constructor.newInstance("Tom", 18);

        System.out.println(tom);

        //通过反射,调用对象的方法,属性
        //属性
        Field age = persionClass.getDeclaredField("name");
        age.set(tom, "Jim");

        System.out.println(tom.toString());


        //方法
        Method play = persionClass.getDeclaredMethod("play");
        play.invoke(tom);


        //调用私有结构 - 构造器,属性,方法

        //属性  - age
        Field age1 = persionClass.getDeclaredField("age");
        age1.setAccessible(true);

        age1.set(tom, 45);

        System.out.println(tom);


        System.out.println(age1.getClass());
        System.out.println(tom.getClass());

    }
    @Test
    public void test2() throws ClassNotFoundException {
        //1
        Class<Persion> c1 = Persion.class;
        System.out.println("c1 = " + c1);

        //2
        Persion p1 = new Persion();
        Class<? extends Persion> c2 = p1.getClass();
        System.out.println("c2 = " + c2);

        //3
        Class<?> c3 = Class.forName("com.learn.l.Persion");
        System.out.println("c3 = " + c3);

        //4
//        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        ClassLoader classLoader = ReflectionTest.class.getClassLoader();
        Class<?> c4 = classLoader.loadClass("com.learn.l.Persion");
        System.out.println("c4 = " + c4);


    }
    
}
