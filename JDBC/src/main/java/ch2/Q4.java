package ch2;
// 陣列反轉
//編寫一個名為"reverseArray()”的函數，參數為一個array of Integers，return type為int[]，返回的值為將array of Integers全部反轉後的新array。
public class Q4 {
    public static int[] reverseArray(int[] arr) {
        int[] CopyArray = new int[arr.length];
        int j = 0;//new Array 的第0項
        for (int i = arr.length - 1; i >= 0 ; i--) {
            CopyArray[j] = arr[i];
            j++;
        }
        return CopyArray;
    }
    public static void main (String[]args){
        int[] array = {4, 3, 6, 7, 9, 10, 33, 0, -4, 12, 400, 133, 324, 1234231, 12334};
        int[] reversedArray = reverseArray(array);
        for (int i : reversedArray) {
            System.out.print(i + " ");
        }
    }
}
