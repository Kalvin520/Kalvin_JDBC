package ch2;
//  檢查array中是否有重複值
//編寫一個名為“findDuplicate()”的函數，將一個整數array作為參數，並檢查array中是否有重複值。如果有，則return true，否則return false。
public class Q8 {
    public static boolean findDuplicate(int[] arr){
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(findDuplicate(new int[] {1, 3, 5, 7, 9, 3}));
        System.out.println(findDuplicate(new int[] {})); // returns false);
        System.out.println(findDuplicate(new int[] {3, 4, 5, 6, 7, 10000, 0}));
    }
}
