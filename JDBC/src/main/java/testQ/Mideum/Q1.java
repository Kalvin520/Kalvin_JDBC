package testQ.Mideum;
//落地問題: 一球從h米高度自由落下，每次落地後反跳回原高度的一半，再落下。求小球在第n次落地時，共經過多少公尺？高度h以及落地次數n為使用者可以輸入的整數，用System.in讀取。
import java.util.Scanner;
public class Q1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h;
        int n;
        System.out.println("請輸入小球初始高度:");
        h = scanner.nextInt();
        System.out.println("輸入小球落地幾次:");
        n = scanner.nextInt();
        double result = h;
        for (int i = 2; i <= n ; i++) {
            result += 2 * (h / Math.pow(2, i-1));
        }
        System.out.println("在 " + h + " 公尺處落下,第 " + n + " 次落地時,小球經過的總距離為 " + result + " 公尺.");
    }
}
