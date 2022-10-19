package com.wimb.netIO;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class TCPClientDemo02 {
    public static void main(String[] args) throws Exception{
        //创建一个socket连接
        Socket socket = new Socket(InetAddress.getByName("192.168.180.1"),9000);
        //创建一个输出流
        OutputStream os = socket.getOutputStream();
        //读取文件
        FileInputStream fis = new FileInputStream("./pic.JPG");
        //写出文件
        byte[] buffer = new byte[1024];
        int len;
        while( (len=fis.read(buffer)) != -1 ){
            os.write(buffer,0,len);
        }

        //通知服务器发送完毕
        socket.shutdownOutput();

        //确定服务端接收完毕
        InputStream inputStream = socket.getInputStream();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buffer2 = new byte[1024];
        int len2;
        while( ( len2 = inputStream.read(buffer2 ) ) != -1 ) {
            baos.write(buffer2,0,len2);
        }

        //关闭资源
        baos.close();
        inputStream.close();
        fis.close();
        os.close();
        socket.close();
    }
}


