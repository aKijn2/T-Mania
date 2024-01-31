import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {

        JFrame windows = new JFrame("Tetris Mania");
        windows.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        windows.setResizable(false);
        
        windows.setLocationRelativeTo(null);
        windows.setVisible(true);
    }
}