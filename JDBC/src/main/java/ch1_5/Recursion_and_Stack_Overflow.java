package ch1_5;
public class Recursion_and_Stack_Overflow {

    public static void printHi(int i){
        if (i == 0){
            return;
        }
        System.out.println("We hust enter printHi with i is " + i);
        printHi(i - 1);
        System.out.println("We finished running printHi with i is " + i);
    }

    public static void main(String[] args) {
        // Recursive method 遞迴函數
        // a method that calls itself
        printHi(10);
    }
}
