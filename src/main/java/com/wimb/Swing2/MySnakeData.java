package com.wimb.Swing2;

import javax.swing.*;
import java.net.URL;

// 存放外部数据
public class MySnakeData {
    // 头部图片 URL：定位图片位置 ImageIcon：图片
    public static URL headerUrl = MySnakeData.class.getResource("/static/header.png");
    public static ImageIcon header = new ImageIcon(headerUrl);

    public static URL upUrl = MySnakeData.class.getResource("/static/up.png");
    public static URL downUrl = MySnakeData.class.getResource("/static/down.png");
    public static URL leftUrl = MySnakeData.class.getResource("/static/left.png");
    public static URL rightUrl = MySnakeData.class.getResource("/static/right.png");
    public static ImageIcon up = new ImageIcon(upUrl);
    public static ImageIcon down = new ImageIcon(downUrl);
    public static ImageIcon left = new ImageIcon(leftUrl);
    public static ImageIcon right = new ImageIcon(rightUrl);

    public static URL bodyUrl = MySnakeData.class.getResource("/static/body.png");
    public static URL foodUrl = MySnakeData.class.getResource("/static/food.png");
    public static ImageIcon body = new ImageIcon(bodyUrl);
    public static ImageIcon food = new ImageIcon(foodUrl);
}
