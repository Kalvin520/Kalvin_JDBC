public class Main {
    public static void main(String[] args) {
        String age = "25";
        System.out.println(Integer.parseInt(age));//轉整數
        System.out.println(4 != 3);//Relational operator
        System.out.println(true && false && (5 > 3));//AND conditional operator
        System.out.println(true || true);//OR conditional operator
        //equal
        System.out.println("welson".equals("welson"));
        //Arithmetic
        System.out.println("15"+"15");
        System.out.println((15 + "15").getClass().getName());
        System.out.println(15 + 15 + "15" + 15 + 15);//優先先計算前方在轉型String串接
    }
}
