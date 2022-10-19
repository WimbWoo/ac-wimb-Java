package com.wimb.Swing1.AWT;

import java.awt.*;

public class TestFrame {
    public static void main(String[] args) {
        Frame frame = new Frame("frame标题");
//        设置窗口可见
        frame.setVisible(true);
//        设置大小
        frame.setSize(400,400);
//        设置背景颜色
        frame.setBackground(Color.BLACK);
//        设置初始位置
        frame.setLocation(900,100);
//        设置大小固定
        frame.setResizable(true);
    }
}

