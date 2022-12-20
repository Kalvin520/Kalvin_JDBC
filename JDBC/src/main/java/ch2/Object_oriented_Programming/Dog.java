package ch2.Object_oriented_Programming;
public class Dog extends Animal{

    public Dog(){
        super("Dog");
    }

    @Override
    public void makeSound(){
        System.out.println("汪汪");
    }
}
