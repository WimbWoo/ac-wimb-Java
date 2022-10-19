package com.wimb.Swing2;

import javax.swing.*;
import java.awt.*;

// Swing组件
public class TestJFrame1 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Frame标题");
        jFrame.setVisible(true);
        jFrame.setBounds(10,10,400,400);

        JLabel jLabel = new JLabel("测试标签");
        Container contentPane = jFrame.getContentPane();
        contentPane.setBackground(Color.BLACK);
        jLabel.setHorizontalAlignment(SwingConstants.CENTER);

        jFrame.add(jLabel);
        // 不设置。默认为隐藏窗口
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
