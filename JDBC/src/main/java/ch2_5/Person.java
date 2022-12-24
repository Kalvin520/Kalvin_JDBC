package ch2_5;

public class Person {
    private String name;
    private int age;
    private Person spouse;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void talk(){

        System.out.println("Hello, my name is " + name);
//        //when checking if something is null or not, we must use == or !=.
//        if (spouse != null) {
//            System.out.println("Hello, my name is " + name + " and my spouse is " + spouse.getName());
//        }else {
//            System.out.println("Hello, my name is " + name + " and I am not yet married.");
//        }
    }

    public void setSpouse(Person spouse) {
        this.spouse = spouse;
    }

    public String getName(){
        return this.name;
    }
}
