package testQ.Mideum;
//輸入某年某月某日，讓程式判斷這一天是這一年的第幾天？使用者可以透過用System.in來給定年月日這三個數字。
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        int year, mon, day;
        int result = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入年份：");
        year = scanner.nextInt();
        System.out.println("請輸入月份：");
        mon = scanner.nextInt();
        System.out.println("請輸入日期：");
        day = scanner.nextInt();

        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        boolean leapYear = (year % 4 == 0);
        if (leapYear) {
            days[1] = 29;
        }
        for (int i = 0; i < mon - 1; i++) {
            result += days[i];
        }
        System.out.println(result + day);
    }
}
