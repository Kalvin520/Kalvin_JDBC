package ch2.Mideum;

import java.util.Scanner;

//求s=a+aa+aaa+aaaa+aa...a的值，其中a是一個數字，相加的項數為n。例如2+22+222+2222+22222(此時共有5個數相加)
// ，幾個數相加有鍵盤控制。若a  =2, n = 3，則輸出結果的形式如：2+22+222 = 246。
public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入a: ");
        int a = scanner.nextInt();
        System.out.println("請輸入n: ");
        int n = scanner.nextInt();
        int result = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i ; j++) {
                result += (a * Math.pow(10, j));
            }
        }
        System.out.println(result);

    }
}
