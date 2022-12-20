package ch2.Object_oriented_Programming;

public class Student extends People{
    private int grades;

    public Student(String name, int age, String address, int grades){
        super(name, age, address);
        this.grades = grades;

    }

    public void learn(){
        System.out.println("Learning...");
    }

    @Override
    public void walk(){
        System.out.println("A student is walking like a boss.");
    }
}
