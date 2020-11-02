package com.learn.k;

import org.junit.Test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


/**
 * @author admin
 * @create 2020/10/25
 */
public class UdpTest {


    @Test
    public void sender()  {
        DatagramSocket socket = null;
        try {
            //socket
            socket = new DatagramSocket();

            String str = "我是UDP方式发送过来的垃圾信息";
            byte[] data = str.getBytes();

            //发送数据包   --  包括 数据 host port
            InetAddress inet = InetAddress.getLocalHost();
            DatagramPacket packet = new DatagramPacket(data, 0, data.length,inet,9999);
            //发送
            socket.send(packet);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (socket != null) {
                //关闭
                socket.close();
            }
        }
    }



    @Test
    public void receiver()  {
        DatagramSocket socket = null;
        try {
            socket = new DatagramSocket(9999);

            byte[] buffer = new byte[100];
            DatagramPacket datagramPacket = new DatagramPacket(buffer, 0,buffer.length);

            socket.receive(datagramPacket);
            System.out.println(new String(datagramPacket.getData(),0,datagramPacket.getLength()));
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (socket != null) {
                socket.close();
            }
        }

    }
}
