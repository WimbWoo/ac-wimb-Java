package com.wimb.Swing2;
import javax.swing.*;
import java.awt.*;

import static java.awt.Color.YELLOW;

public class TestJFrame2 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setBounds(10,10,400,400);
        jFrame.setVisible(true);

        JButton jLabel = new JButton("测试按钮");
//        jFrame.setBackground(Color.BLACK);
        Container contentPane = jFrame.getContentPane();
        contentPane.setBackground(YELLOW);
//        设置居中
        jLabel.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel.addActionListener(e ->
                new Mydiglog()
        );
        contentPane.setLayout(null);
        jLabel.setLocation(50,50);
        jLabel.setSize(200,50);
        contentPane.add(jLabel);
//        不设置，默认是隐藏窗口
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
class Mydiglog extends JDialog{
    public Mydiglog(){
        setVisible(true);
        setBounds(10,10,500,500);
//        弹窗默认带了关闭，不需要写
//        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JLabel jLabel = new JLabel("测试弹窗标签2 ");
        Container container = getContentPane();
        container.setLayout(null);
        jLabel.setLocation(10,10);
        jLabel.setSize(100,20);
        container.add(jLabel);
    }
}

