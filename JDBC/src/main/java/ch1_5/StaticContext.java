package ch1_5;

public class StaticContext {
    public static int add(int x, int y){
        return x + y;
    }

    public static void main(String[] args) {
        System.out.println(add(10, 20));
    }
}
