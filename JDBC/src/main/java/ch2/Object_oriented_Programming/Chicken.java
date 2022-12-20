package ch2.Object_oriented_Programming;

public class Chicken extends Animal implements Edible{
    public Chicken(){
        super("chicken");
    }

    @Override
    public void makeSound(){
        System.out.println("咕咕");
    }

    @Override
    public String howToEat() {
        return "Boiled chicken is not bad, but BBQ chicken is the best.";
    }
}
