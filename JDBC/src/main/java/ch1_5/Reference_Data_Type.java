package ch1_5;

/**
 * @Author Kalvin
 */

public class Reference_Data_Type {
    public static int changeA(int x){
        x = 20;
        return x;
    }

    public static void changeFirstElement(int[] arr){
        arr[0] = 1000;
    }
    public static void main(String[] args) {
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



        //Reference data type(non-primitive data type)


//        int[] myArray1 = {10, 20, 30};
//        int[] muArray2 = myArray1; //copy by reference
//        myArray1[0] = 100;
//        for(int i : myArray1){
//            System.out.print(i + " ");
//        }
//        System.out.println();
//        for (int i : muArray2) {
//            System.out.print(i + " ");
//        }


        //Non-primitive data type
        //method's actual parameter
        //Java => copy by reference
         int[] myArray3 = {10, 20, 30};
         changeFirstElement(myArray3);

        for (int i : myArray3) {
            System.out.print(i + " ");
        }
    }
}
