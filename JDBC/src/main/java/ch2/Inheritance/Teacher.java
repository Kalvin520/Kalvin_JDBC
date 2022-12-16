package ch2.Inheritance;

public class Teacher {
    private String name;
    private int age;
    private String address;
    private String subject;
    public Teacher(String  name, int age, String address, String subject){
        this.name = name;
        this.age = age;
        this.address = address;
        this.subject = subject;
    }

    public void walk(){
        System.out.println("Walking...");
    }

    public void sleep(){
        System.out.println("Sleeping...");
    }

    public void teach(){
        System.out.println("Teaching " + subject + "...");
    }

}
