package com.wimb.Swing1.AWT;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// 监听器
public class TestActionEvent1 {
    public static void main(String[] args) {
        Frame frame = new Frame("测试监听器");
        frame.setBounds(0,0,400,400);
        frame.setVisible(true);
        Button button = new Button("111");
        button.addActionListener((actionEvent) -> {
            System.out.println(1);
        });
        button.addActionListener((actionListenEvent) -> {
            System.out.println(2);
        });
        frame.add(button, BorderLayout.EAST);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
