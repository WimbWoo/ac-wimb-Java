package com.wimb.Swing2;

import javax.swing.*;
import java.awt.*;

public class IconFrame1 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setBounds(10,10,400,400);
        jFrame.setVisible(true);
        JLabel jButton = new JLabel(" 标签", new MyIconDemo(100,100), SwingConstants.CENTER);
//        不设置，默认是隐藏窗口
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jButton.setSize(100,100);
        jFrame.add(jButton);
    }
}
class MyIconDemo implements Icon{
    private int iconWiddth;
    private int iconHeight;

    public MyIconDemo(int iconWiddth,int iconHeight){
        this.iconWiddth = iconWiddth;
        this.iconHeight = iconHeight;
    }
    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        g.fillOval(x,y,iconWiddth,iconHeight);
    }

    @Override
    public int getIconWidth() {
        return iconWiddth;
    }

    @Override
    public int getIconHeight() {
        return iconHeight;
    }
}

