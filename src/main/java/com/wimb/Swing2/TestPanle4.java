package com.wimb.Swing2;

import javax.swing.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class TestPanle4 {
    public static void main(String[] args)  {
        JFrame jFrame = new JFrame();
        jFrame.setBounds(10,10,400,400);
        jFrame.setVisible(true);
        JTextArea jTextArea = new JTextArea(50,50);
//        滚动条面板
        JScrollPane jButton = new JScrollPane(jTextArea);
        jFrame.add(jButton);
        jFrame.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentHidden(ComponentEvent e) {
                System.exit(0);
            }
        });
    }
}
