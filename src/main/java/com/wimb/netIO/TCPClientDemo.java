package com.wimb.netIO;

import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class TCPClientDemo {
    public static void main(String[] args) {
        Socket socket = null;
        OutputStream os = null;

        try {
            //服务器的地址、端口号
            InetAddress serverIP = InetAddress.getByName("127.0.0.1");//本地IP
            int port = 9999;
            //创建一个socket连接
            socket = new Socket(serverIP,port);
            //发送消息io流
            os = socket.getOutputStream();
            os.write("MCFLY".getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(os != null)
            {
                try {
                    os.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if(socket!=null)
            {
                try {
                    socket.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

    }
}




