package ch1_5;

public class Exchange_Elements {
    public static void main(String[] args) {
        int a= 5;
        int b =6;
        int temp;
        temp = a;
        a = b;
        b = temp;

        System.out.println("a="+ a +" "+ "b=" + b);
    }
}
