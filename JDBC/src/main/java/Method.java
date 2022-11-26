public class Method {

    public Method(){

    }

    public void testing(){
        for (int j = 0; j < 100; j++) {
            for (int i = 0; i < 100; i++) {
                if (i == 5) {
                    return;
                }
                System.out.println(j + " " + i);
            }
        }
    }

    public void sayHello(){
        System.out.println("Hello!");
    }

    //parameter list (formal parameter)
    public int multiply(int a, int b){
        return a * b;
    }

    public static void main(String[] args) {
        Method method = new Method();
//        //actual parameter
////        System.out.println(method.multiply(5, 4) + method.multiply(7, 7));
//        int a = method.multiply(4, 3);
//        int b = method.multiply(5, 6);
//        System.out.println(a + b);
        method.testing();

    }
}
