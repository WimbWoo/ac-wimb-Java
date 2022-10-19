package com.wimb.IO;

import ch.qos.logback.classic.net.SimpleSocketServer;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author: meng.wu01
 * @DateTime: 2021/8/17
 */
public class SocketHttpDemo {

    public static void main(String[] args) throws IOException {
        ExecutorService executorService = Executors.newFixedThreadPool(40);
        ServerSocket serverSocket = new ServerSocket(8081);
        while (true) {
            Socket socket = serverSocket.accept();
            executorService.execute(()->{
                service(socket);
            });
        }
    }

    private static void service(Socket socket) {
        try {
            Thread.sleep(20);
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);
            printWriter.println("HTTP/1.0 200 ok");
            printWriter.println("Content-type:text/html;charset=utf-8");
            printWriter.println();
            printWriter.println("hello nio");
            printWriter.close();
            socket.close();

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
