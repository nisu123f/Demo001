package com.learn.j;

import org.junit.Test;

import java.io.*;

/**
 * @author admin
 * @create 2020/10/24
 */
public class FileReaderWriterTest {

    /*
    * IO流分类:
    * 操作数据的单位 :  字节流(InputStream OutputStream)     字符流(Reader Writer)
    * 操作的方向    :   输入(InputStream  Reader)           输出(OutputStream  writer)
    * 流的角色      :  节点流                              处理流
    *
    * */

    @Test
    public void test() {
        FileReader fileReader = null;
        try {
            //实例化File,操作对象
            File file = new File("D:\\io\\io1\\io1.txt");
            //提供具体的流
            fileReader = new FileReader(file);
            //数据的读入
            int read;

            //这个是不对的, 当读到read == -1时,未经判断直接输出了
//        do {
//            read = fileReader.read();
//            System.out.print((char)read);
//        } while (read != -1);


            //改为
//        read = fileReader.read();
//        while (read != -1) {
//            System.out.print((char)read);
//            read = fileReader.read();
//        }

            //化简
            while ((read = fileReader.read()) != -1) {
                System.out.print((char)read);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    @Test
    public void test1() {
        FileReader fileReader = null;
        try {
            //1.File的实例化
            File file = new File("D:\\io\\io1\\io1.txt");
            //2.FileReader的实例化
            fileReader = new FileReader(file);
            //3.读入操作
            char[] chars = new char[5];
            int len;
            while ((len = fileReader.read(chars)) != -1) {
//                for (int i = 0; i < len; i++) {
//                    System.out.print(chars[i]);
//                }

                String str = new String(chars, 0, len);
                System.out.print(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.资源的关闭
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    /*
    * file如果不存在,不会报错且自动创建
    *     如果存在,是覆盖还是追加
    *      取决于 FileWriter(file,append);
    *
    * */
    @Test
    public void test2()  {
        FileWriter fileWriter = null;
        try {
            //1.实例化File
            File file = new File("D:\\io\\io1\\io2.txt");
            //2.提供FileWriter
            fileWriter = new FileWriter(file,true);
            //3.写出的操作
            fileWriter.write("I have a dream!");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //4.流资源的关闭
            try {
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    @Test
    public void test3() {

    }

}
