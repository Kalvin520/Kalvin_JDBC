package ch2.Inheritance;

public class People {
    protected String name;
    protected int age;
    protected String address;

    public People(){
        this.name = "Kalvin";
        this.age  = 0;
        this.address = "Taiwan";
    }
    public People(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void walk(){
        System.out.println("Walking...");
    }

    public void sleep(){
        System.out.println("Sleeping...");
    }

    public void printHello() { System.out.println("Hello from People class."); }

}
