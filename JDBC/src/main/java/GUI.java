import javax.swing.*;
import java.awt.*;

public class GUI extends JPanel {
    @Override
    public void paintComponent(Graphics graphics){
        
    }
    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(400,300);
        window.setVisible(true);
    }
}
