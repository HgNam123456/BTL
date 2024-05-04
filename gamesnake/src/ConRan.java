import java.awt.*;
import java.util.Random;

public class ConRan {
    int DodDai = 3;
    int [] x;
    int [] y;
    long t1 = 0;
    public static int GO_UP = 1;
    public static int GO_DOWN = -1;
    public static int GO_LEFT = 2;
    public static int GO_RIGHT = -2;

    int vector = ConRan.GO_DOWN;


    public ConRan(){
        x = new int[20];
        y = new int[20];
        x[0] = 5;
        y[0] = 4;
        x[1] = 6;
        x[2] = 7;
        y[1] = 4;
        y[2] = 4;

    }
    public void setVector(int v){

        if(vector != -v){
            vector = v;
        }
    }

    public Point LayToaDoMoi(){
        Random r = new Random();
        int x = r.nextInt(19);
        int y = r.nextInt(19);
        return new Point(x,y);
    }
    public void update(){
        if(System.currentTimeMillis()-t1>100){
            if(GameScreen.bg[x[0]][y[0]] == 2){
                DodDai++;
                GameScreen.bg[x[0]][y[0]] = 0;
                GameScreen.bg[LayToaDoMoi().x][LayToaDoMoi().y] = 2;
            }
            for (int i = DodDai-1; i >0 ; i--) {
                x[i] = x[i-1];
                y[i] = y[i-1];
            }
            if (vector == ConRan.GO_UP){
                y[0]--;
                

            }
            if (vector == ConRan.GO_DOWN){
                y[0]++;
            }
            if (vector == ConRan.GO_LEFT){
                x[0]--;
            }
            if (vector == ConRan.GO_RIGHT){
                x[0]++;
            }
            if(x[0] < 0) x[0] =19;
            if(x[0] > 19) x[0] =0;
            if(y[0] < 0) y[0] =19;
            if(y[0] > 19) y[0] =0;

            t1 = System.currentTimeMillis();
        }

    }

    public void VeRan(Graphics g){
        g.setColor(Color.red);
        for (int i = 1; i < DodDai; i++) {
            g.fillRect(x[i]*20+1,y[i]*20+1,18,18);
        }
        g.setColor(Color.blue);
        g.fillRect(x[0]*20+1,y[0]*20+1,18,18);
    }
}
