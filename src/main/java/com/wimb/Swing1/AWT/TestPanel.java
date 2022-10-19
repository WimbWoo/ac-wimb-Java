package com.wimb.Swing1.AWT;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestPanel {
    public static void main(String[] args) {
        Frame frame = new Frame("带面板的Frame");
        Panel panel = new Panel();
        frame.setBounds(400,400,500,500);
        frame.setBackground(Color.BLACK);
        frame.setLayout(null);

        panel.setBounds(100,100,300,300);
        panel.setBackground(Color.YELLOW);
//        将面板放入frame中
        frame.add(panel);
        frame.setVisible(true);
//        添加监听
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
