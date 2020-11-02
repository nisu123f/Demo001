package com.learn.j;

import org.junit.Test;

import java.io.*;

/**
 * @author admin
 * @create 2020/10/24
 */
public class BufferTest {
    @Test
    public void test(){
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            //文件和流
            File srcFile = new File("D:\\video11.mp4");
            File dstFile = new File("D:\\video22.mp4");

            bis = new BufferedInputStream(new FileInputStream(srcFile));
            bos = new BufferedOutputStream(new FileOutputStream(dstFile));

            //流的操作  in - > out
            byte[] bytes = new byte[1024];
            int len;
            while ((len = bis.read(bytes)) != -1) {
                bos.write(bytes, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //关闭流
            if (bis != null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }



}
