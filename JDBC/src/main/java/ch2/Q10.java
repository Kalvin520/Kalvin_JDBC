package ch2;
//編寫一個名為“findSmallCount()”的函數，它以一個整數array和一個整數n作為參數，並返回一個整數，表示array中有多少元素小於輸入整數n。
public class Q10 {
    public static int findSmallCount(int[] arr, int n){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < n){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(findSmallCount(new int[] {1, 2, 3}, 2));
        System.out.println(findSmallCount(new int[] {1, 2, 3, 4, 5}, 0));
    }
}
