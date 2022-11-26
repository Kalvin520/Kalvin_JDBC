public class Method_Overloading {
    public Method_Overloading(){

    }

    public void addition(int a, int b){
        System.out.println(a + b);
    }

    public void addition(String a, String b){
        System.out.println(a + b);
    }
    public static void main(String[] args) {
        Method_Overloading method_overloading = new Method_Overloading();
        method_overloading.addition(1, 2);//actual parameter
        method_overloading.addition("Hello ", "World");//
    }
}
