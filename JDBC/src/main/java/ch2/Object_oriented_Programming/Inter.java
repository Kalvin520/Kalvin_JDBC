package ch2.Object_oriented_Programming;

public class Inter {
    public static void main(String[] args) {
        Edible chicken = new Chicken();
        Chicken chicken1 = new Chicken();
        System.out.println(chicken.howToEat());
        chicken1.makeSound();
    }
}
