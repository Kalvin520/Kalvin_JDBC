package testQ.easy;
//編寫一個名為"pyramid()”的函數，唯一的參數為一個大於0的整數，功能為打印出如下規律的金字塔:
public class Q9 {
    public static void  pyramid(int n){
        //method one
        for (int i = 1; i <= n; i++) {
            for (int j = 0 ; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //method two
//        String s ="";
//        for (int i = 1; i <= n; i++) {
//            s += "*";
//            System.out.println(s);
//        }
    }

    public static void main(String[] args) {
        pyramid(1);
        System.out.println("====================");
        pyramid(3);
        System.out.println("====================");
        pyramid(5);
    }
}
