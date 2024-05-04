import javax.swing.*;
import java.awt.*;

import static java.lang.Thread.sleep;

public class GameScreen extends JPanel implements Runnable {
    Thread thread;
    static int [][] bg = new int[20][20];

    ConRan ran;
    public GameScreen(){
        ran = new ConRan();
        thread = new Thread(this);
        thread.start();
        bg[10][10] = 2;
    }
    public void run(){
        while (true){
           repaint();
           ran.update();
            try {
                sleep(20);
            } catch (InterruptedException e) {

            }
        }
    }

    public void paintBg(Graphics g){
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                g.fillRect(i*20+1,j*20+1,18,18);
                if(bg[i][j] == 2){
                    g.setColor(Color.red);
                    g.fillRect(i*20+1,j*20+1,18,18);
                    g.setColor(Color.black);
                }
            }
        }

    }
    public void paint(Graphics g){
        paintBg(g);
        ran.VeRan(g);
    }

}
