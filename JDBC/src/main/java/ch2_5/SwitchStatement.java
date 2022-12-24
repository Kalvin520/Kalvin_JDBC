package ch2_5;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class SwitchStatement extends JPanel implements KeyListener {
    Sheep s;
     public SwitchStatement(){
         s = new Sheep(40,40);
         addKeyListener(this);
     }


    @Override
    public void paintComponent(Graphics graphicspaint){
         graphicspaint.setColor(Color.black);
         graphicspaint.fillRect(0, 0, getWidth(), getHeight());
         s.drawSheep(graphicspaint);
         requestFocusInWindow();
    }

    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setSize(500, 500);
        window.setContentPane(new SwitchStatement());
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int k = e.getKeyCode();
        switch (k){
            case KeyEvent.VK_UP:
                s.walk(0,-5);
                break;
            case KeyEvent.VK_DOWN:
                s.walk(0, 5);
                break;
            case KeyEvent.VK_RIGHT:
                s.walk(5, 0);
                break;
            case KeyEvent.VK_LEFT:
                s.walk(-5, 0);
                break;
            default:
                JOptionPane.showMessageDialog(this,"Please use an arrow key.");
        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
