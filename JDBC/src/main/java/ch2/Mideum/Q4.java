package ch2.Mideum;
//打印出所有的"水仙花數"，所謂"水仙花數"是指一個三位數，其各位數字立方和等於該數本身。例如：153是一個"水仙花數"，因為$153=1^3+5^3+3^3$，或370也是水仙花數，因為$370=3^3+7^3+0^3$。
public class Q4 {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            int unit = i % 10;
            int tens = (i / 10) % 10;
            int hundred = (i / 100) % 10;
            int sum = (int) (Math.pow(unit, 3) + Math.pow(tens, 3) + Math.pow(hundred, 3));

            if (sum == i){
                System.out.println(i);
            }
        }
    }
}
