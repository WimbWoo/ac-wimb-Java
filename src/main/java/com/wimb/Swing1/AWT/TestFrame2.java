package com.wimb.Swing1.AWT;

import java.awt.*;

public class TestFrame2 {
    public static void main(String[] args) {
        new myFrame(100,100,200,200,Color.BLACK);
        new myFrame(300,100,200,200,Color.BLUE);
        new myFrame(100,300,200,200,Color.YELLOW);
        new myFrame(300,300,200,200,Color.WHITE);
    }

}
class myFrame extends Frame {
    //        计数器
    private static int id = 0;
    public myFrame(int x, int y, int w, int h, Color color){
        super("MyFrame+"+id++);
        this.setBounds(x,y,w,h);
        this.setBackground(color);
        this.setVisible(true);
    }
}