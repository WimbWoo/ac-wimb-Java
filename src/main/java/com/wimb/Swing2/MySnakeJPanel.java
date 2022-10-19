package com.wimb.Swing2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class MySnakeJPanel extends JPanel implements KeyListener, ActionListener {

    // 初始化长度和初始位置
    int length;
    int snakeX[] = new int[600];
    int snakeY[] = new int[600];
    // 定义蛇的方向
    String fx;
    // 游戏是否开始
    boolean isStart = false;
    // 定时器
    Timer timer = new Timer(100, this);
    // 定义食物
    int foodx;
    int foody;
    Random random = new Random();
    // 游戏是否失败
    boolean isFail = false;
    // 分数
    int score;

    public MySnakeJPanel() {
        // 初始化参数
        init();
        // 获取键盘监听事件
        this.setFocusable(true); // 获取键盘监听焦点，使得焦点一直在游戏界面
        // 监听空格没有反应：主方法StartGame中 setVisible 放在最后
        this.addKeyListener(this); // 获取键盘监听事件
    }

    private void init() {
        length = 3; //初始长度
        snakeX[0] = 100; snakeY[0] = 100; // 蛇头位置
        snakeX[1] = 75; snakeY[1] = 100; // 第一个身体坐标
        snakeX[2] = 50; snakeY[2] = 100; // 第二个身体坐标
        fx = "R";
        // 定时器开启
        timer.start();
        // 食物位置坐标初始化
        foodx = 25 + 25 * random.nextInt(34);//越界判断
        foody = 75 + 25 * random.nextInt(24);
        // 初始化分数
        score = 0;
    }

    // 画板
    // Graphics 画笔
    @Override
    protected void paintComponent(Graphics g) {
        // 清屏
        super.paintComponent(g);
        this.setBackground(Color.BLACK);
        // 绘制头部广告栏
//        MySnakeData.header.paintIcon(this, g, 25, 11);
        // 绘制游戏区域
        g.fillRect(25, 75, 850, 600);
        switch (fx) {
            case "R":
                MySnakeData.right.paintIcon(this, g, snakeX[0], snakeY[0]);
                break;
            case "L":
                MySnakeData.left.paintIcon(this, g, snakeX[0], snakeY[0]);
                break;
            case "U":
                MySnakeData.up.paintIcon(this, g, snakeX[0], snakeY[0]);
                break;
            case "D":
                MySnakeData.down.paintIcon(this, g, snakeX[0], snakeY[0]);
        }

        // 画蛇的身体
        for (int i = 1; i < snakeX.length; i++) {
            MySnakeData.body.paintIcon(this, g, snakeX[i], snakeY[i]);
        }

        // 画食物
        MySnakeData.food.paintIcon(this, g, foodx, foody);

        // 画分数
        g.setColor(Color.WHITE);
        g.setFont(new Font("微软雅黑", Font.BOLD, 15));
        g.drawString("长度：" + length, 750, 35);
        g.drawString("得分：" + score, 750, 50);

        // 游戏提示：是否开始
        if (isStart == false) {
            g.setColor(Color.WHITE);
            g.setFont(new Font("微软雅黑", Font.BOLD, 40));
            g.drawString("请按下游戏开始", 300, 300);
        }
        if (isFail) {
            g.setColor(Color.RED);
            g.setFont(new Font("微软雅黑", Font.BOLD, 40));
            g.drawString("游戏失败！", 300, 300);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // 键盘敲击
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // 键盘按下，未释放
        int keyCode = e.getKeyCode();
        if (KeyEvent.VK_SPACE == keyCode) {
            if (isFail) {
                isFail = false;
                init();
            } else {
                isStart = !isStart;
                // 刷新页面
            }
            repaint();
        }
        // 键盘控制方向
        if (KeyEvent.VK_UP == keyCode) {
            fx = "U";
        } else if (KeyEvent.VK_DOWN == keyCode) {
            fx = "D";
        } else if (KeyEvent.VK_LEFT == keyCode) {
            fx = "L";
        } else if (KeyEvent.VK_RIGHT == keyCode) {
            fx = "R";
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // 键盘释放
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // 执行定时操作
        if (isStart && !isFail) {
            // 注意点：要从后往前移动位置，不然会导致节点覆盖
            for (int i = length-1; i >= 1; i--) {
                snakeX[i] = snakeX[i-1];
                snakeY[i] = snakeY[i-1];
            }
            // 上下左右移动
            if (fx.equals("L")) {
                snakeX[0] = snakeX[0] - 25;
                // 越界判断
                if (snakeX[0] < 25) {
                    snakeX[0] = 850;
                }
            } else if (fx.equals("R")) {
                snakeX[0] = snakeX[0] + 25;
                if (snakeX[0] > 850) {
                    snakeX[0] = 25;
                }
            } else if (fx.equals("U")) {
                snakeY[0] = snakeY[0] - 25;
                if (snakeY[0] < 75) {
                    snakeY[0] = 650;
                }
            } else if (fx.equals("D")) {
                snakeY[0] = snakeY[0] + 25;
                if (snakeY[0] > 650) {
                    snakeY[0] = 75;
                }
            }

            // 判断是否蛇头位置和食物位置是否重合
            if (foodx == snakeX[0] && foody == snakeY[0]) {
                // 长度增加
                length++;
                // 得分
                score++;
                // 重新生成食物位置
                foodx = 25 + 25 * random.nextInt(34);//越界判断
                foody = 75 + 25 * random.nextInt(24);
            }

            // 判断是否失败：蛇头是否与身体的某个节点重合
            for (int i = 1; i < length; i++) {
                if (snakeX[0] == snakeX[i] && snakeY[0] == snakeY[i]) {
                    isFail = true;
                    break;
                }
            }
            repaint();
        }
    }

    // 监听键盘输入
}
