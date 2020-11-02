package com.learn.j;

import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Date;

/**
 * @author admin
 * @create 2020/10/24
 */
public class IoTest {
    /*
    * java.io.File类：文件和文件目录路径的抽象表示形式，与平台无关
    *  File 能新建、删除、重命名文件和目录，但 File 不能访问文件内容本身。
    * 如果需要访问文件内容本身，则需要使用输入/输出流。
    *  想要在Java程序中表示一个真实存在的文件或目录，那么必须有一个File对象，
    * 但是Java程序中的一个File对象，可能没有一个真实存在的文件或目录。
    *  File对象可以作为参数传递给流的构造器
    */


    @Test
    public void test() {
        File file1 = new File("D:\\io");
        System.out.println(file1);

        File file2 = new File("D:\\io","io1");
        System.out.println(file2);

        File file3 = new File(file2, "io2");
        System.out.println(file3);

    }

    /*
    *  File类的获取功能
    *  public String getAbsolutePath()：获取绝对路径
    *  public String getPath() ：获取路径
    *  public String getName() ：获取名称
    *  public String getParent()：获取上层文件目录路径。若无，返回null
    *  public long length() ：获取文件长度（即：字节数）。不能获取目录的长度。
    *  public long lastModified() ：获取最后一次的修改时间，毫秒值
    *  public String[] list() ：获取指定目录下的所有文件或者文件目录的名称数组
    *  public File[] listFiles() ：获取指定目录下的所有文件或者文件目录的File数组
    * */


    @Test
    public void test1() {
        File file = new File("D:\\io\\io1");
        File file2 = new File(file, "io.txt");

        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
        System.out.println(file.getName());
        System.out.println(file.getParent());
        //用于文件
        System.out.println(file.length());
        System.out.println(file2.length());

        System.out.println(new Date(file.lastModified()));

        String[] list = file.list();
        for (String s : list) {
            System.out.println("s = " + s);
        }

        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println("file1 = " + file1);
        }

    }

    /*
    *  File类的重命名功能  public boolean renameTo(File dest):把文件重命名为指定的文件路径
    * */

    @Test
    public void test2() {
        File file = new File("D:\\io\\io1\\io1.txt");
        File destFile1 = new File("D:\\io\\io.txt");
        boolean b = destFile1.renameTo(file);
        if (b) {
            System.out.println("重命名成功");
        }
    }

    /*
    *  File类的判断功能
    *  public boolean isDirectory()：判断是否是文件目录
    *  public boolean isFile() ：判断是否是文件
    *  public boolean exists() ：判断是否存在
    *  public boolean canRead() ：判断是否可读
    *  public boolean canWrite() ：判断是否可写
    *  public boolean isHidden() ：判断是否隐藏
    * */

    @Test
    public void test3() {

    }

    /*
    *  File类的创建功能
    *  public boolean createNewFile() ：创建文件。若文件存在，则不创建，返回false
    *  public boolean mkdir() ：创建文件目录。如果此文件目录存在，就不创建了。 如果此文件目录的上层目录不存在，也不创建。
    *  public boolean mkdirs() ：创建文件目录。如果上层文件目录不存在，一并创建
    * 注意事项：如果你创建文件或者文件目录没有写盘符路径，那么，默认在项目 路径下。
    *
    * *  File类的删除功能
    *  public boolean delete()：删除文件或者文件夹 删除注意事项： Java中的删除不走回收站。
    * 要删除一个文件目录，请注意该文件目录内不能包含文件或者文件目录
    * */

    @Test
    public void test4() {

    }

    @Test
    public void test5() {

    }

    @Test
    public void test6() {

    }

    @Test
    public void test7() {

    }

}
