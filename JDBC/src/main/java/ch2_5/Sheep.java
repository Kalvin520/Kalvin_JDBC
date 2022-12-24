package ch2_5;

import java.awt.*;

public class Sheep {
    private int x;
    private int y;
     public Sheep(int x, int y){
         this.x = x;
         this.y = y;
     }

     @Override
    public String toString(){
         return this.x + "," + this.y;
     }

     public void drawSheep(Graphics graphicssheep){
         graphicssheep.setColor(Color.white);
         graphicssheep.fillOval(x+25, y+50, 225, 100);//橢圓形
         graphicssheep.fillOval(x, y, 75, 75);//橢圓形
         graphicssheep.fillRect(x+50, y+100, 25,100);
         graphicssheep.fillRect(x+100, y+100, 25,100);
         graphicssheep.fillRect(x+150, y+100, 25,100);
         graphicssheep.fillRect(x+200, y+100, 25,100);
     }

     public void walk(int x, int y){
         this.x += x;
         this.y += y;
     }
}
