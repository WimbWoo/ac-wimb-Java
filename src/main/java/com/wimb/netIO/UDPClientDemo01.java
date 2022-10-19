package com.wimb.netIO;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClientDemo01 {
    public static void main(String[] args) throws Exception {
        //建立Socket
        DatagramSocket socket = new DatagramSocket( 9002 );
        //建包
        String msg = "Hello,World!" ;
        InetAddress localhost = InetAddress.getByName("localhost");
        int port = 9001;
        DatagramPacket packet = new DatagramPacket(msg.getBytes(),0,msg.getBytes().length,localhost,port);
        //发送包
        socket.send(packet);
    }
}


