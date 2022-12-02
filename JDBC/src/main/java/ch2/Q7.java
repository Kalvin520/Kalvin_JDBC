package ch2;
//  第一個input是否以第二個input結束
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
