public class Main {
    public static void main(String[] args) {
        String age = "25";
        System.out.println(Integer.parseInt(age));//轉整數
        System.out.println(4 != 3);//Relational operator
        System.out.println(true && false && (5 > 3));//AND conditional operator
        System.out.println(true || true);//OR conditional operator
        //equal
        System.out.println("welson".equals("welson"));
        //Arithmetic operator
        //String + String
        System.out.println("15"+"15");
        //Number + String
        System.out.println((15 + "15").getClass().getName());
        System.out.println(15 + 15 + "15" + 15 + 15);//優先先計算前方在轉型String串接
        //Number * String
        //System.out.println("hello" * 10);//不允許的

        //float / int
        System.out.println(9.0/ 10);
    }
}
