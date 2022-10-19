package com.wimb.netIO;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;

// UDP循环发送消息
public class UDPSenderDemo {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(9999);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while( true ){
            String data = reader.readLine();
            byte[] datas = data.getBytes();
            DatagramPacket packet = new DatagramPacket(datas,0,datas.length,new InetSocketAddress("localhost",6666));
            socket.send(packet);
            if( data.equals("bye")){
                break;
            }
        }
        socket.close();
    }
}

