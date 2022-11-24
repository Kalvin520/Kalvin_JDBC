import javax.swing.*;
import java.awt.*;

public class GUI extends JPanel {
    @Override
    public void paintComponent(Graphics graphics){
        int width = getWidth();
        int height = getHeight();
        //graphics.drawRect(100,100,50,60);//設定選定x,y點寬高 畫出空心長方形
        graphics.setColor(Color.BLACK);
        graphics.fillRect(0,0,width,height);

        //graphics.drawString("Hello world.",100,100);//設定輸出文字與 x,y
        graphics.setColor(Color.red);//設定顏色
        graphics.drawLine(720,60,0,720);//設定線畫出的座標


    }
    public static void main(String[] args) {
        JFrame window = new JFrame();//創建初始化物件
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(720,720);//設定視窗大小
        window.setContentPane(new GUI());
        window.setVisible(true);
    }
}
