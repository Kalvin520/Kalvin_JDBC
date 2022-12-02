package ch2.easy;
// 找出大寫字母 && index
//編寫一個名為“position()”的函數，input為String。函數沒有任何return type，但需要打印出第一個大寫字母及其index位置。 如果未找到，則打印 -1。
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
