package ch2.easy;
//計算1+2+3+.....+(n-1)
//編寫一個名為"addUpTo()”的函數，參數為一個整數n，return type為int，return應為 1 + 2 + 3 + … + (n - 1) + n的值。
public class Q5 {
    public static int addUpTowithFormula(int n){
        //等差級數 ((a1 + an) * n )/ 2
        return ((1 + n) * n)/2;

    }
    public static int addUpTowithForloop(int n){
        int sum = 0;
        // for loop
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int addUpTowithRecusive(int n){
        if (n == 0){
            return 0;
        }else {
        return n + addUpTowithRecusive(n - 1);
        }
    }
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(addUpTowithFormula(10));
        System.out.println(addUpTowithFormula(100));
        System.out.println(addUpTowithFormula(1000));
        System.out.println(addUpTowithFormula(10000));
        long end = System.currentTimeMillis();
        System.out.println("With formula, the time difference is " + (end - start));

        start = System.currentTimeMillis();
        System.out.println(addUpTowithForloop(10));
        System.out.println(addUpTowithForloop(100));
        System.out.println(addUpTowithForloop(1000));
        System.out.println(addUpTowithForloop(10000));
        end = System.currentTimeMillis();
        System.out.println("With for loop, the time difference is " + (end - start));

        start = System.currentTimeMillis();
        System.out.println(addUpTowithRecusive(10));
        System.out.println(addUpTowithRecusive(100));
        System.out.println(addUpTowithRecusive(9000));
        end = System.currentTimeMillis();
        System.out.println("With Recusive, the time difference is " + (end - start));
    }
}
