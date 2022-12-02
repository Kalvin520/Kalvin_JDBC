package ch2.easy;
//  第一個input是否以第二個input結束
//編寫一個名為“confirmEnding”的函數，它將 2 個String作為input，並返回一個boolean，該boolean指示第一個input是否以第二個input結束。
public class Q7 {
        public static boolean confirmEnding(String s1, String s2){
            int i = s1.length() - 1;
            for (int j = s2.length() - 1; j >= 0; j--){
                if (s1.charAt(i) != s2.charAt(j)){
                    return false;
                }
                i--;
            }
            return true;
        }
        public static void main(String[] args) {
            System.out.println(confirmEnding("Bastian", "n"));
            System.out.println(confirmEnding("Connor", "n"));
            System.out.println(confirmEnding("Open sesame", "same"));
        }
}
