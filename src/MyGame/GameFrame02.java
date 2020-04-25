package MyGame;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GameFrame02 extends Frame {

    Image img = GameUtil.getImage("MyGame/sun.jpg");

    //加载窗口
    public void launchFrame() {
        setSize(500, 500);

        setLocation(100, 100);

        setVisible(true);

        new paintThread().start();//启动重画线程

        addWindowFocusListener(new WindowAdapter() {

            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }

    private double x = 100, y = 100;
    private double degree = 3.14 / 3;
    private boolean left;
    private boolean up;

    public void paint(Graphics g) {
        g.drawImage(img, (int) x, (int) y, null);

        x += 3;
        y += 3;
        x += 10 * Math.cos(degree);
        y += 10 * Math.sin(degree);
        if (y > 500 - 30 || y < 30) {
            degree = -degree;
        }
        if (y < 30) {
            degree = -degree;
        }
        if (x < 0) {
            degree = Math.PI - degree;

        }
        if (x < 500 - 30) {
            degree = Math.PI - degree;
        }

    }


    class paintThread extends Thread {
        //定义一个重画窗口的线程类，是一个内部类
        public void run() {
            while (true) {
                repaint();
                try {
                    Thread.sleep(40);
                } catch (InterruptedException e) {
                    e.printStackTrace();
        }
        }
        }
        }


    public static void main(String[] args) {
        GameFrame gf = new GameFrame();
        gf.launchFrame();
    }
    }
