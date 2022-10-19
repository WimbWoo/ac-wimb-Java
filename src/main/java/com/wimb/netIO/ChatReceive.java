package com.wimb.netIO;

import java.io.IOException;
import java.net.*;

// 聊天室消息接收端
public class ChatReceive implements Runnable{
    // 初始化
    DatagramSocket socket = null;
    private int port;
    private String msgFrom;

    public ChatReceive(int port, String msgFrom) throws SocketException {
        this.port = port;
        this.msgFrom = msgFrom;
        socket = new DatagramSocket(port);
    }

    @Override
    public void run() {
        while (true) {
            byte[] container = new byte[1024];
            DatagramPacket datagramPacket = new DatagramPacket(container, 0, container.length);
            try {
                socket.receive(datagramPacket);
                byte[] data = datagramPacket.getData();
                String receiveData = new String(data, 0, datagramPacket.getLength());
                System.out.println(msgFrom + ":" + receiveData);
                if (receiveData.equals("byte")) {
                    break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        socket.close();
    }
}
