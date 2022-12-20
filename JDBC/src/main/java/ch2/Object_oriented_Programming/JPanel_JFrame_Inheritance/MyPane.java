package ch2.Object_oriented_Programming.JPanel_JFrame_Inheritance;

import javax.swing.*;
import java.awt.*;

public class MyPane extends JPanel {
    @Override
    public void paintComponent(Graphics graphics){
        System.out.println("paintComponent");
        graphics.setColor(Color.black);
        graphics.fillRect(0, 0, getWidth(), getHeight());
        graphics.setColor(Color.white);
        graphics.drawString("Hello world", 100,100);
    }

}
