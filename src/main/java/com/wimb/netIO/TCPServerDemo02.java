package com.wimb.netIO;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerDemo02 {
    public static void main(String[] args) throws Exception {
        //创建服务
        ServerSocket serverSocket = new ServerSocket(9000);
        //监听客户端连接
        Socket socket = serverSocket.accept(); //阻塞式监听
        //获取输入流
        InputStream is = socket.getInputStream();
        //文件输出
        FileOutputStream fos = new FileOutputStream(new File("receive.JPG"));
        byte[] buffer = new byte[1024];
        int len;
        while( (len = is.read(buffer)) != -1 ) {
            fos.write(buffer,0,len);
        }

        //通知客户端接收完毕
        OutputStream os = socket.getOutputStream();
        os.write("我已接收，感觉良好".getBytes());

        //关闭资源
        os.close();
        fos.close();
        is.close();
        socket.close();
        serverSocket.close();

    }
}


