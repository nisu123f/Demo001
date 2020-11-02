package com.learn.l;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

/**
 * @author admin
 * @create 2020/10/26
 */
public class ClassLoaderTest {
    @Test
    public void test1() throws Exception {
        Properties properties = new Properties();

        FileInputStream fis = new FileInputStream("src\\jdbc.properties");
        properties.load(fis);

        String name = properties.getProperty("name");
        String petName = properties.getProperty("petName");
        System.out.println("name = " + name + " ,petName = " + petName);

    }


    @Test
    public void test3() throws Exception {
        Properties properties = new Properties();

//        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
//        ClassLoader classLoader = this.getClass().getClassLoader();

        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("jdbc.properties");

        properties.load(is);

        String name = properties.getProperty("name");
        String petName = properties.getProperty("petName");
        System.out.println("name = " + name + " ,petName = " + petName);
    }

    @Test
    public void test4 () {
        System.out.println(this.getClass());
    }



}
