package ch2.Object_oriented_Programming;

class A{
    public void hello(){
        System.out.println("Hello from class A.");
    }
}

class B extends A {
    public void hello(){
        System.out.println("Hello from class B.");
    }
}

public class Dynamic_Binding {
    public static void main(String[] args) {
        A b = new B();
        A a = new A();

        b.hello(); //JVM 決定指向 B class Dynamic Binding
        a.hello();
    }
}
