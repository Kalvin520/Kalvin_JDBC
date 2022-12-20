package ch2.Object_oriented_Programming;

public class Cat extends Animal{
    public Cat(){
        super("Cat");
    }

    @Override
    public void makeSound(){
        System.out.println("喵喵");
    }
}
