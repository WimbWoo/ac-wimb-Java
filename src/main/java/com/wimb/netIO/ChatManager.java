package com.wimb.netIO;

import java.net.SocketException;

public class ChatManager {
    public static void main(String[] args) throws SocketException {
        new Thread(new ChatSend(7777,"localhost", 9999)).start();
        new Thread(new ChatReceive(8888, "老师")).start();
    }
}
