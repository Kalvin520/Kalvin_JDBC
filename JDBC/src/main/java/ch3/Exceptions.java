package ch3;

import javax.swing.*;

public class Exceptions {
    int age;
    String agrString;

    public Exceptions(){
        agrString  = JOptionPane.showInputDialog("what is your age?");
        try {
            age = Integer.parseInt(agrString);
            if (age <= 18){
                System.out.println("Cannot drive Car.");
            }else {
                System.out.println("You can drive.");
            }
        }catch (NumberFormatException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        //new Exceptions();
        int[] arr = {1,2,3};
        System.out.println(arr[3]);

    }
}
