import javax.swing.*;

public class FrameScreen extends JFrame {
    GameScreen gameScreen;
    public FrameScreen(){
        gameScreen = new GameScreen();
        add(gameScreen);
    }
    public static void main(String[] args) {
        FrameScreen frameScreen = new FrameScreen();
        frameScreen.setSize(500,500);
        frameScreen.setVisible(true);
        frameScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
