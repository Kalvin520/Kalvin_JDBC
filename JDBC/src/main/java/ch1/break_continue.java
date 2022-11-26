package ch1;

public class break_continue {
    public static void main(String[] args) {
        //breakm continue => loop
        //ex1
//        int i = 0;
//        while(i < 10){
//            System.out.println(i);
//            i++;
//            if (i == 5){
//                continue;
//            }
//            System.out.println("we are here");

        //ex2
        for (int i = 0; i < 15; i++) {
            if(i == 10){
                continue;
        }
            System.out.println(i);
        }

    }
}
