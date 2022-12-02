package ch2;

import javax.swing.plaf.synth.SynthTabbedPaneUI;

public class Q6 {
    public static void position(String s){
        boolean found = false;

        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (Character.toUpperCase(c) == c){
                System.out.println(c + " " + i);
                found = true;
                return;
            }
        }

        if (!false){
            System.out.println(-1);
        }
    }

    public static void main(String[] args) {
        position("abcd");
        position("AbcD");
        position("abCD");
    }
}
