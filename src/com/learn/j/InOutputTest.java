package com.learn.j;

import org.junit.Test;

import java.io.*;

/**
 * @author admin
 * @create 2020/10/24
 */
public class InOutputTest {
    @Test
    public void test(){
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            //1.File实例化
            File srcFile = new File("D:\\video.mp4");
            File dstFile = new File("D:\\video11.mp4");
            //2.流的实例化
            fileInputStream = new FileInputStream(srcFile);
            fileOutputStream = new FileOutputStream(dstFile);
            //3.流的操作
            //copy  in -> out
            byte[] bytes = new byte[1024];
            int len;
            while ((len = fileInputStream.read(bytes)) != -1) {
                fileOutputStream.write(bytes);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //4.流的关闭
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }



    }
}
