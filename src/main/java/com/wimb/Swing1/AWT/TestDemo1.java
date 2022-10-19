package com.wimb.Swing1.AWT;

import java.awt.*;

// 嵌套式布局
public class TestDemo1 {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setVisible(true);
        frame.setBounds(100,100,800,800);
        Button button1 = new Button("button1");
        Button button2 = new Button("button2");
        Button button3 = new Button("button3");
        Button button4 = new Button("button4");
        Button button5 = new Button("button5");
        Button button6 = new Button("button6");
        Button button7 = new Button("button7");
        Button button8 = new Button("button8");
        Button button9 = new Button("button9");
        Button button10 = new Button("button10");
        frame.setLayout(null);
        Panel panel1 = new Panel(new GridLayout(1,1));
        panel1.setBounds(0,0,200,400);
        panel1.add(button1);
        Panel panel3 = new Panel(new GridLayout(2,1));
        panel3.setBounds(200,0,400,400);
        panel3.add(button2);
        panel3.add(button3);
        Panel panel4 = new Panel(new GridLayout(1,1));
        panel4.setBounds(600,0,200,400);
        panel4.add(button4);

        Panel panel2 = new Panel(new GridLayout());
        panel2.setBounds(0,400,200,400);
        panel2.add(button5);
        Panel panel5 = new Panel(new GridLayout(2,2));
        panel5.setBounds(200,400,400,400);
        panel5.add(button6);
        panel5.add(button7);
        panel5.add(button8);
        panel5.add(button9);
        Panel panel6 = new Panel(new GridLayout());
        panel6.setBounds(600,400,200,400);
        panel6.add(button10);

        frame.add(panel1);
        frame.add(panel3);
        frame.add(panel4);
        frame.add(panel2);
        frame.add(panel5);
        frame.add(panel6);
    }
}
