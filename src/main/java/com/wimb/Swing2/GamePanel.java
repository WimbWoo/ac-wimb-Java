package com.wimb.Swing2;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.URL;
import java.util.Random;

//             游戏面板          继承面板           接口监控器
public class GamePanel extends JPanel implements KeyListener , ActionListener {
    //定义蛇的数据结构
    int length;
    int[] snakeX = new int[600];    //蛇的x坐标
    int[] snakeY = new int[500];    //蛇的x坐标
    String fx;                     //初始化方法

    //食物的坐标
    int foodx;
    int foody;
    Random random = new Random();

    //积分
    int score;

    //游戏开始、结束状态
    boolean isStart = false;        //默认不开始
    boolean isFail = false;         //默认失败状态

    //定时器  以 ms 为单位 1000ms = 1s
    Timer timer = new Timer(100,this);  //100毫秒执行一次

    //构造器
    public GamePanel() {
        init();
        //获得焦点和键盘事件
        this.setFocusable(true);    //获得焦点事件
        this.addKeyListener(this);//获得当前类键盘监听事件
        timer.start();  //游戏一开始定时器就启动
    }

    //初始化小蛇
    public void init(){
        length = 3;
        snakeX[0] = 100;snakeY[0] = 100;    //脑袋的坐标
        snakeX[1] = 75;snakeY[1] = 100;     //第一个身体的坐标
        snakeX[2] = 50;snakeY[2] = 100;     //第二个身体的坐标
        fx = "R";                           //初始化方法向右
        score = 0;

        //食物随机分布
        foodx = 25 + 25*random.nextInt(34); //25*34=850为整个界面大小
        foody = 75 +25*random.nextInt(24);
    }

    //绘制面板，我们游戏中所有东西，都是用这个画笔来画
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);        //清屏，提高画面
        //绘制静态的面板
        this.setBackground(Color.WHITE);
        Data.biaoti.paintIcon(this,g,15,11);      //头部广告栏画上去
        g.fillRect(15,75,850,600);      //默认的游戏界面

        //画积分
        g.setColor(Color.WHITE);
        g.setFont(new Font("微软雅黑",Font.BOLD,18));
        g.drawString("长度"+length,750,30);
        g.drawString("分数"+score,750,50);

        //食物
        Data.food.paintIcon(this,g,foodx,foody);

        //把小蛇画上去
        if (fx.equals("R")){
            Data.right.paintIcon(this,g,snakeX[0],snakeY[0]); //蛇头
        } else if (fx.equals("L")) {
            Data.left.paintIcon(this,g,snakeX[0],snakeY[0]);   //蛇头
        } else if (fx.equals("U")) {
            Data.up.paintIcon(this,g,snakeX[0],snakeY[0]);   //蛇头
        }else if (fx.equals("D")) {
            Data.down.paintIcon(this,g,snakeX[0],snakeY[0]);   //蛇头
        }

        for (int i = 1; i < length ; i++) {         //for循环根据length身体的长度，对身体进行制作。
            Data.body.paintIcon(this,g,snakeX[i],snakeY[i]);    //身体
        }
        //游戏状态

        if (isStart == false){  //字体
            g.setColor(Color.white);
            g.setFont(new Font("微软雅黑",Font.BOLD,40)); //设置字体；类型-粗、斜-大小
            g.drawString("按下空格开始游戏",300,300);
        }
        if (isFail){
            g.setColor(Color.red);
            g.setFont(new Font("微软雅黑",Font.BOLD,40)); //设置字体；类型-粗、斜-大小
            g.drawString("游戏失败，按下空格重新开始",300,300);
        }

    }

    //键盘监听
    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();       //获取键盘按键是哪个
        if (keyCode == KeyEvent.VK_SPACE){  //如果 按下 == 空格
            if (isFail){    //重新开始
                isFail = false;
                init();                     //从新开始
            }else {
                isStart = !isStart;             //取反 ！非
            }
            repaint();
        }

        //小蛇移动
        if (keyCode == KeyEvent.VK_UP&& fx!="D"){
            fx = "U";
        }else if (keyCode == KeyEvent.VK_DOWN&& fx!="U") {
            fx = "D";
        }else if (keyCode == KeyEvent.VK_LEFT&& fx!="R") {
            fx = "L";
        }else if (keyCode == KeyEvent.VK_RIGHT&& fx!="L") {
            fx = "R";
        }

    }
    //事件监听——需要通过固定事件刷新，1s = 10次
    @Override
    public void actionPerformed(ActionEvent e) {

        if (isStart && isFail == false){//如果游戏是开始状态,且不是游戏失败
            //食物
            if (snakeX[0] == foodx && snakeY[0] == foody){
                //长度+1
                length ++;
                //积分+10
                score = score+10;
                //再次随机食物
                foodx = 25 + 25*random.nextInt(34);
                foody = 75 +25*random.nextInt(24);

            }

            //就让小蛇动起来,默认右移
            for (int i = length-1; i >0 ; i--) {    //后一节移到前一节的位置 snakeX[1] = snakeX[1-1=0];
                snakeX[i] = snakeX[i-1];
                snakeY[i] = snakeY[i-1];
            }
            //边界判断,走向
            if (fx.equals("R")){
                snakeX[0] = snakeX[0]+25;
                if (snakeX[0]>850){ snakeX[0] = 15;
                }
            }else if (fx.equals("L")){
                snakeX[0] = snakeX[0]-25;
                if (snakeX[0]<15){ snakeX[0] = 850;
                }}else if (fx.equals("U")){
                snakeY[0] = snakeY[0]-25;
                if (snakeY[0]<75){ snakeY[0] = 650;
                }}else if (fx.equals("D")){
                snakeY[0] = snakeY[0]+25;
                if (snakeY[0]>650){ snakeY[0] = 75;
                }}
            //如果头碰到身体，则isFail为true 失败
            for (int i = 1; i < length; i++) {
                if (snakeX[0] == snakeX[i] && snakeY[0] == snakeY[i]){
                    isFail = true;
                }

            }
            repaint();  //重画页面
        }
        timer.start();  //定时器开启
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
    @Override
    public void keyTyped(KeyEvent e) {

    }
}


//数据中心
class Data {
    //相对路径 tx.jpg
    //绝对路径 /  相当于当前的项目
    public static URL biaotiURL = Data.class.getResource("static/biaoti.png");
    public static ImageIcon biaoti = new ImageIcon(biaotiURL);

    public static URL shetousURL = Data.class.getResource("static/sss.png");
    public static URL shetouxURL = Data.class.getResource("statics/xxx.png");
    public static URL shetouzURL = Data.class.getResource("statics/zzz.png");
    public static URL shetouyURL = Data.class.getResource("statics/yyy.png");
    public static ImageIcon up = new ImageIcon(shetousURL);
    public static ImageIcon down = new ImageIcon(shetouxURL);
    public static ImageIcon left = new ImageIcon(shetouzURL);
    public static ImageIcon right = new ImageIcon(shetouyURL);

    public static URL lvURL = Data.class.getResource("statics/lv.png");
    public static URL qiuURL = Data.class.getResource("statics/qiu.png");
    public static ImageIcon body = new ImageIcon(lvURL);
    public static ImageIcon food = new ImageIcon(qiuURL);

}

