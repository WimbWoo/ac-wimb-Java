package com.wimb.Swing1.AWT;

import java.awt.*;

public class TestGridLayout {
    public static void main(String[] args) {
        // 表格式布局
        Frame frame = new Frame();
        frame.setVisible(true);
        frame.setBounds(400,400,500,500);

        Button button1 = new Button("but1");
        Button button2 = new Button("but2");
        Button button3 = new Button("but3");
        Button button4 = new Button("but4");
        Button button5 = new Button("but5");
        Button button6 = new Button("but6");
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        frame.setLayout(new GridLayout(3,2));
        // 自动布局大小,测试过程中发现不能在第一行写这个，需要在添加完毕后增加会分配默认size
        frame.pack();
    }
}
