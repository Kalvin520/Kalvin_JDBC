package ch1;

public class while_loop {
    public static void main(String[] args) {
//        int i = 0;
//        while(i < 10){
//            System.out.println("the Value of i is " + i);
//            i++;
//        }

        for (int i = 0; i < 10; i++) {
            for (int j = 3; j > 0; j--){
                System.out.println(i + "," + j);
            }
        }
    }
}
