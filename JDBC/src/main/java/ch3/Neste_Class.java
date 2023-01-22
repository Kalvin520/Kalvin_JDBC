package ch3;

public class Neste_Class{
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.printI();
    }
}
