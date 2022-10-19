package com.wimb.Swing1.AWT;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestKeyListener {
    public static void main(String[] args) {
        new MyKeyFrame().loadMyPaint();
    }
}

class MyKeyFrame extends Frame{
    public MyKeyFrame(){
        super("默认窗口名称");
    }
    public void loadMyPaint(){
        setVisible(true);
        setBounds(100,100,800,600);
        addKeyListener(new KeyAdapter() {
            // 按下键时执行
            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                System.out.println(keyCode);
                if(keyCode == KeyEvent.VK_ENTER){
                    System.out.println("按了回车");
                }
            }
        });
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
