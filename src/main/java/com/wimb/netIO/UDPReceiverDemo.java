package com.wimb.netIO;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPReceiverDemo {
    public static void main(String[] args) throws Exception{
        DatagramSocket socket = new DatagramSocket( 6666 );
        while( true ){
            byte[] buffer = new byte[1024];
            DatagramPacket packet = new DatagramPacket(buffer,0,buffer.length);
            socket.receive(packet);
            byte[] data = packet.getData();
            String receiveData = new String(data,0,data.length);
            System.out.println(receiveData);
            if( receiveData.equals("bye")){
                break;
            }
        }
    }
}
