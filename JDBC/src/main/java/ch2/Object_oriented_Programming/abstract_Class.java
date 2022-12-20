package ch2.Object_oriented_Programming;

public class abstract_Class {
    public static void main(String[] args) {
        Animal dog1 = new Dog();
        Dog dog2 = new Dog();
        Animal cat1 = new Cat();

        //polymorphism 生態多樣性
        dog1.makeSound();
        dog2.makeSound();
        cat1.makeSound();
    }
}
