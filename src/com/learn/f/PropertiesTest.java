package com.learn.f;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author admin
 * @create 2020/10/19
 */
public class PropertiesTest {
    @Test
    public void test1() throws IOException {
        Properties properties = new Properties();

        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\admin\\AppData\\Roaming\\JetBrains\\IntelliJIdea2020.1\\scratches\\jdbc.properties");

        properties.load(fileInputStream);

        String name = properties.getProperty("user");

        System.out.println("user = " + name);


    }
}
