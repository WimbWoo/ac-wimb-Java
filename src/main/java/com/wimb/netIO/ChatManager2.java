package com.wimb.netIO;

import java.net.SocketException;

public class ChatManager2 {
    public static void main(String[] args) throws SocketException {
        new Thread(new ChatSend(5555,"localhost", 8888)).start();
        new Thread(new ChatReceive(9999, "老师")).start();
    }
}
