package MyGame;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GameFrame extends Frame {

    Image img = GameUtil.getImage("MyGame/sun.jpg");

    //加载窗口
    public void launchFrame() {
        setSize(500, 500);

        setLocation(100,100);

        setVisible(true);

        new PaintThread().start();//启动重画线程

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }

    private double x = 100, y = 100;
    private double degree=3.14/3;//[0,pi]
    private double speed =10;
    public void paint(Graphics g) {


        g.drawImage(img, (int) x, (int) y, null);

        if (speed>0){
            speed -=0.1;
        }else{
            speed=0;
        }

        x += speed*Math.cos(degree);
        y +=speed*Math.sin(degree);

        if(y>500-30){
            degree = -degree;
        }if(y<30){
           degree = -degree;
        }
        if(x<0){
            degree = Math.PI-degree;
        }
        if(x>500-30){
            degree = Math.PI-degree;
        }


    }


    class PaintThread extends Thread {
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
