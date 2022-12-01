package ch2;
//等差數列
public class Q1 {
    public static void printEvery3(){
        int end  = 88; //末項
        int first = 1; //首項
        int d = 3; //公差
        int an = 0;
        for (int i = 0; i <= end/d; i++) {
            an  = first + i * d;
            System.out.println(an);
        }


    }
    public static void main(String[] args) {
        printEvery3();
    }
}
