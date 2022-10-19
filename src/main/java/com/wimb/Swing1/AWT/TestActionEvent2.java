package com.wimb.Swing1.AWT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// 一个监听器同时给多个按钮使用
public class TestActionEvent2 {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setVisible(true);
        frame.setBounds(100,100,500,500);
//      一个监听可以多个按钮共同使用
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(e.getActionCommand());
            }
        };
        Button button1 = new Button("1");
//        可以为按钮带参数来控制同一个监听执行不同按钮的方法
        button1.setActionCommand("11111111111111");
        button1.addActionListener(actionListener);
        Button button2 = new Button("2");
        button2.addActionListener(actionListener);
        frame.add(button1,BorderLayout.NORTH);
        frame.add(button2,BorderLayout.SOUTH);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
