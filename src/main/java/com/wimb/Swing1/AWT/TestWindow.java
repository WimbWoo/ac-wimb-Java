package com.wimb.Swing1.AWT;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestWindow {
    public static void main(String[] args) {
        new MyWindow().loadMyPaint();
    }
}
class MyWindow extends Frame{
    public MyWindow(){
        super("默认窗口名称");
    }
    public void loadMyPaint(){
        setVisible(true);
        setBounds(100,100,800,600);
        addWindowListener(new WindowAdapter() {
            //            点击窗口关闭按钮
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                System.out.println("窗口失去焦点");
            }

            //            打开窗口时执行
            @Override
            public void windowOpened(WindowEvent e) {
                System.out.println("windowOpened");
            }

            @Override
            public void windowClosed(WindowEvent e) {
                System.out.println("windowClosed");
            }

            @Override
            public void windowIconified(WindowEvent e) {
                System.out.println("缩小");
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                System.out.println("缩小对应的弹出窗口");
            }

            @Override
            public void windowActivated(WindowEvent e) {
                setTitle("被激活了窗口");
            }


            @Override
            public void windowStateChanged(WindowEvent e) {
                System.out.println("windowStateChanged");
            }

            @Override
            public void windowGainedFocus(WindowEvent e) {
                System.out.println("windowGainedFocus");
            }

            @Override
            public void windowLostFocus(WindowEvent e) {
                System.out.println("windowLostFocus");
            }
        });

    }
}
