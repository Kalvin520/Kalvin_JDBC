package ch2;
//等差數列
public class Q1 {
    public static void printEvery3(){
        int an  = 88; //末項
        int a1 = 1; //首項
        int d = 3; //公差
        for (int i = 0; i <= an/d; i++) {
            System.out.println(a1 + i * d);
        }



    }
    public static void main(String[] args) {
        printEvery3();
        for (int i = 1; i <= 88 ; i+=3) {
            System.out.println(i);
        }
    }
}
