package ch3;

public class Person_Chaining {
    private String name;
    private int age;
    private String major;
    private double gpa;

    public Person_Chaining setName(String name) {
        this.name = name;
        return this;
    }
    public Person_Chaining setAge(int age) {
        this.age = age;
        return this;
    }

    public Person_Chaining setMajor(String major) {
        this.major = major;
        return this;
    }

    public Person_Chaining setGpa(float gpa) {
        this.gpa = gpa;
        return this;
    }
}

