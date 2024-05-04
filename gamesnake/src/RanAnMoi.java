import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class RanAnMoi extends JFrame {
    GameScreen game;
    public RanAnMoi(){
        setSize(500,500);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        game = new GameScreen();
        add(game);

        this.addKeyListener(new handler());
        setVisible(true);
    }

    public static void main(String[] args) {
        RanAnMoi ranAnMoi = new RanAnMoi();

    }
    private class handler implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {
            if(e.getKeyCode() == KeyEvent.VK_UP){
                game.ran.setVector(ConRan.GO_UP);
            }
            if(e.getKeyCode() == KeyEvent.VK_DOWN){
                game.ran.setVector(ConRan.GO_DOWN);
            }
            if(e.getKeyCode() == KeyEvent.VK_LEFT){
                game.ran.setVector(ConRan.GO_LEFT);
            }
            if(e.getKeyCode() == KeyEvent.VK_RIGHT){
                game.ran.setVector(ConRan.GO_RIGHT);
            }



        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    }
}
