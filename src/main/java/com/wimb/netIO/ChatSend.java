package com.wimb.netIO;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;

// 聊天室消息发送端
public class ChatSend implements Runnable{
    // 参数初始化
    DatagramSocket socket = null;
    BufferedReader reader = null;

    private int fromPort;
    private String toIp;
    private int toPort;

    public ChatSend(int fromPort, String toIp, int toPort) {
        this.fromPort = fromPort;
        this.toIp = toIp;
        this.toPort = toPort;

        try {
            socket = new DatagramSocket(fromPort);
            reader = new BufferedReader(new InputStreamReader(System.in));
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void run() {
        while (true) {
            try {
                String data = reader.readLine();
                byte[] bytes = data.getBytes();
                DatagramPacket datagramPacket =
                        new DatagramPacket(bytes, 0, bytes.length, new InetSocketAddress(this.toIp, this.toPort));
                socket.send(datagramPacket);
                if (data.equals("byte")) {
                    break;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        socket.close();
    }
}
