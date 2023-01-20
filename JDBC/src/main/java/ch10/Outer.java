package ch10;

public class Outer {
    private int i = 0;
    private void printHello(){
        System.out.println("Hello");
    }

    // outer class members 也可以取用private的 variable

    class Inner{
        void printI(){
            System.out.println(i);
            printHello();
        }
    }
}
