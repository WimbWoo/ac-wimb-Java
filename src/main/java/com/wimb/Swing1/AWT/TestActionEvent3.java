package com.wimb.Swing1.AWT;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// 监听输入框
public class TestActionEvent3 {
    public static void main(String[] args) {
        new MyTestFrame();
    }
}

class MyTestFrame extends Frame {
    public MyTestFrame() {
        TextField textField = new TextField();
        textField.addActionListener((event) -> {
            System.out.println(textField.getText());
            textField.setText("");
        });
        this.setVisible(true);
        this.setBounds(100,100,500,500);
        add(textField);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
