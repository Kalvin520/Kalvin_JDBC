import javax.swing.*;
import java.awt.*;

public class LoopLab extends JPanel {
    @Override
    public void paintComponent(Graphics graphics){
        String type = JOptionPane.showInputDialog("Do you want an addition table or multiplication table? (A or M)");
        int n = Integer.parseInt(JOptionPane.showInputDialog("How big do you want the table to be?"));

        int w = getWidth();
        int h = getHeight();
    }
    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize( 400,400);
        window.setContentPane(new LoopLab());
        window.setVisible(true);
    }
}
