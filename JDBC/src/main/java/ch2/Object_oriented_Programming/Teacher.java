package ch2.Object_oriented_Programming;

public class Teacher extends People {
    private String subject;
    public Teacher(String  name, int age, String address, String subject){
        super(name, age, address);
        this.subject = subject;
    }

    public void teach(){
        super.printHello();
        System.out.println("Teaching " + subject + "...");
    }



}
