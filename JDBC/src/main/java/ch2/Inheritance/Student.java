package ch2.Inheritance;

public class Student {
    private String name;
    private int age;
    private String address;
    private int grades;

    public Student(String name, int age, String address, int grades){
        this.name = name;
        this.age = age;
        this.address = address;
        this.grades = grades;
    }

    public void walk(){
        System.out.println("Walking...");
    }

    public void sleep(){
        System.out.println("Sleeping...");
    }

    public void learn(){
        System.out.println("Learning...");
    }
}
