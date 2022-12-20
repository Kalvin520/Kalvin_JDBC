package ch2.Object_oriented_Programming.JPanel_JFrame_Inheritance;

import javax.swing.*;

public class JP_JF_Inher {
    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setSize(500,500);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setContentPane(new MyPane());//設定內容 執行 Mypane 的 default constructor
        window.setVisible(true);
    }
}
