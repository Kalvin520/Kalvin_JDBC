package ch1_5;

public class String_split_and_substring_method {
    public static void main(String[] args) {

        //1.
//        String s = "Hello, how are you doing today?";
//        String[] myArr = s.split(" "); //regular expression
//        for(String small : myArr){
//            System.out.println(small);
//        }

        //2.
        String s2 = "Hello";
        s2 = s2.substring(0, 5); // 0 is inclusive, 4 is exclusive
        System.out.println(s2);
    }
}
