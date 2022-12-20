package ch2.Object_oriented_Programming;

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

    public boolean equal(Object objOverride){
        if (objOverride instanceof People){
            People person = (People) objOverride;
            return this.age == person.age;
        }
        return false;
    }

}
