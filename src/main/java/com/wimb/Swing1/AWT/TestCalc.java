package com.wimb.Swing1.AWT;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestCalc {
    public static void main(String[] args) {
        new myCal();
    }
}
class myCal extends Frame{
    public myCal(){
        TextField jia1 = new TextField("10");
        TextField jia2 = new TextField("10");
        TextField rest = new TextField("20");
        setLayout(new FlowLayout());
        add(jia1);
        add(new Label("+"));
        add(jia2);
        Button button = new Button("=");
        button.addActionListener(e -> {
            int jia = Integer.parseInt(jia1.getText());
            int beijia = Integer.parseInt(jia2.getText());
            rest.setText(jia+beijia+"");
        });
        add(button);
        add(rest);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setVisible(true);
        pack();

    }
}
