package com.wimb.Swing2;

import javax.swing.*;

public class StartGame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.add(new GamePanel());

        // 窗口大小在设定游戏时，就已经设计好的
        frame.setBounds(10,10,900,720);
        frame.setResizable(false);      //窗口大小不可变
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }
}
