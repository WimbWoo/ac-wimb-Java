package com.wimb.Swing1.AWT;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestFlowLayout {
    public static void main(String[] args) {
        // 演示1：支持layout位置
//        Frame frame = new Frame("测试LayOut");
//        Button b1 = new Button("按钮1");
//        Button b2 = new Button("按钮2");
//        frame.add(b1);
//        frame.add(b2);
//        frame.setVisible(true);
//        frame.setBounds(400,400,500,500);
//        frame.setLayout(new FlowLayout(FlowLayout.CENTER));
//        frame.addWindowListener(new WindowAdapter() {
//            @Override
//            public void windowClosing(WindowEvent e) {
//                System.exit(0);
//            }
//        });

        // 演示：支持button支持东南西北的位置
        Frame frame = new Frame();
        frame.setVisible(true);
        frame.setBounds(400,400,500,500);
        Button east = new Button("East");
        Button west = new Button("West");
        Button south = new Button("South");
        Button north = new Button("North");
        Button center = new Button("Center");

        frame.add(east,BorderLayout.EAST);
        frame.add(west,BorderLayout.WEST);
        frame.add(south,BorderLayout.SOUTH);
        frame.add(north,BorderLayout.NORTH);
//        frame.add(center,BorderLayout.CENTER);
    }
}
