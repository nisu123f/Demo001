package com.learn.k;

import org.junit.Test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @author admin
 * @create 2020/10/26
 */
public class UrlTest {
    @Test
    public void test() {
        HttpURLConnection urlConnection = null;
        InputStream is = null;
        FileOutputStream fos = null;
        try {
            //获取url
            URL url = new URL("http://");
            //打开连接
            urlConnection = (HttpURLConnection) url.openConnection();
            //连接
            urlConnection.connect();
            //流 及 操作
            is = urlConnection.getInputStream();
            fos = new FileOutputStream("e1.jpg");
            byte[] buffer = new byte[1024];
            int len;
            while((len = is.read(buffer)) != -1) {
                fos.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //关闭流
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (urlConnection != null) {
                urlConnection.disconnect();
            }

        }


    }
}
