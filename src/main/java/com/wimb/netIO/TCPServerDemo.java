package com.wimb.netIO;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerDemo {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket socket = null;
        InputStream is = null;
        ByteArrayOutputStream baos = null;

        try {
            //地址
            serverSocket = new ServerSocket(9999);
            while( true ){
                //等待客户连接
                socket = serverSocket.accept();
                //读取客户消息
                is = socket.getInputStream();
                //管道流
                baos = new ByteArrayOutputStream();
                byte[] buffer = new byte[1024];
                int len;
                while( (len = is.read(buffer)) != -1 ){
                    baos.write(buffer,0,len);
                }
                System.out.println(baos.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if(baos != null)
            {
                try {
                    baos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(is != null)
            {
                try {
                    is.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if(socket != null)
            {
                try {
                    socket.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if(serverSocket != null)
            {
                try {
                    serverSocket.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

