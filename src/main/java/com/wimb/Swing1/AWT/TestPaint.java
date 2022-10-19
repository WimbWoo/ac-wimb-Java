package com.wimb.Swing1.AWT;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestPaint {
    public static void main(String[] args) {
        new MyPaint().loadPaint();
    }
}

class MyPaint extends Frame {
    public void loadPaint() {
        setVisible(true);
        setBounds(100, 100, 800, 600);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.setColor(Color.blue);
        g.drawOval(100,100,100,100);
        g.fillOval(100,200,100,100);
        g.fillRect(100,300,200,100);
    }
}

