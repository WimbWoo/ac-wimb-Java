package com.wimb.Swing1.AWT;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// 测试鼠标监听画图
public class TestMouseListenter {
    public static void main(String[] args) {
        new Paint("画图").loadMyPaint();
    }
}
class Paint extends Frame {
    private List<Point> pointList;
    private Paint cuttorPaint;
    public Paint(String title){
        super(title);
        cuttorPaint = this;
        pointList = new ArrayList<>();
    }
    public void loadMyPaint(){
        setVisible(true);
        setBounds(100,100,800,600);
        addMouseListener(new MyMouseListenter());
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        Iterator<Point> iterator = pointList.iterator();
        while (iterator.hasNext()){
            Point point = iterator.next();
            // 循环画列表的点坐标
            g.fillOval(point.x,point.y,10,10);
        }
    }

    private class MyMouseListenter extends MouseAdapter{
        // 按下鼠标时触发
        @Override
        public void mousePressed(MouseEvent e) {
            pointList.add(new Point(e.getX(),e.getY()));
            //画笔重新画点
            cuttorPaint.repaint();
        }
    }
}
