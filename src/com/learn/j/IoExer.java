package com.learn.j;

import org.junit.Test;

import java.io.File;
import java.io.FilenameFilter;

/**
 * @author admin
 * @create 2020/10/24
 */
public class IoExer {

    //找到以 .jpg 结尾的文件
    @Test
    public void test1() {
        File file = new File("D:\\io\\io1");
        String[] list = file.list();
        for (String s : list) {
            if (s.endsWith(".jpg")) {
                System.out.println(s);
            }
        }
    }

    @Test
    public void test2() {
        File file = new File("D:\\io\\io1");
        String[] list = file.list(new FilenameFilter() {

            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".jpg");
            }
        });

        for (String s : list) {
            System.out.println("s = " + s);
        }

    }

    @Test
    public void test3() {
        File file = new File("D:\\io\\io1");
        String[] list = file.list((dir, name) -> name.endsWith(".jpg"));

        for ( String s : list) {
            System.out.println("s = " + s);
        }
    }

    public static void main(String[] args) {
        // 递归:文件目录
        /** 打印出指定目录所有文件名称，包括子文件目录中的文件 */

        // 1.创建目录对象
        File dir = new File("D:\\io");

        // 2.打印目录的子文件
        printSubFile(dir);
    }

    public static void printSubFile(File dir) {
        // 打印目录的子文件
        File[] subfiles = dir.listFiles();

        for (File f : subfiles) {
            // 文件目录
            if (f.isDirectory()) {
                printSubFile(f);
            } else {// 文件
                System.out.println(f.getAbsolutePath());
            }

        }

    }
}
