package ch2.easy;
// 99乘法表
//編寫一個名為“ninetable()”的函數，它打印出九九乘法表的內容。
public class Q2 {
    public static void ninetable(){
        for (int i = 1; i <=9; i++) {
            for (int j = 1; j <=9; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
        }
    }

    public static void main(String[] args) {
        ninetable();
    }
}
