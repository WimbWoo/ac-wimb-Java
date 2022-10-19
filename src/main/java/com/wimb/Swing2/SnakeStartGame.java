package com.wimb.Swing2;

import javax.swing.*;

public class SnakeStartGame {
    public static void main(String[] args) {
        // 1.绘制静态窗口 jFrame
        JFrame jFrame = new JFrame("贪吃蛇游戏");

        // 设置窗口位置
        jFrame.setBounds(10,10,900,720);
        // 2.设置画板
        jFrame.add(new MySnakeJPanel());
        // 窗口大小不可变
        jFrame.setResizable(false);
        // 设置关闭事件
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
