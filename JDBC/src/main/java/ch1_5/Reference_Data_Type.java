package ch1_5;

public class Reference_Data_Type {

//    public static int changeA(int x){
//        x = 20;
//        return x;
//    }
    public static void main(String[] args) {
        //Reference data type(non-primitive data type)
//        int a = 10;
//        changeA(a);
//        System.out.println(a);
//        System.out.println(changeA(a)); // 10 or 20?

        //Java's primitive data type is used as sn actual parameter(a)
        //Java copy by value



        //primitive data type
        //assignment operator => copy by value
//        int a = 10;
//        int b = a;
//        a = 30;
//        System.out.println(a + " " + b);


        int[] myArray1 = {10, 20, 30};
        int[] muArray2 = myArray1; //copy by reference
        myArray1[0] = 100;
        for(int i : myArray1){
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : muArray2) {
            System.out.print(i + " ");
        }
    }
}
