package ch3;

import java.io.FileNotFoundException;

public class throw_and_throws {
    public static void main(String[] args) throws FileNotFoundException {
        Circle c1 = new Circle(10);
        try {
            c1.setRadius(-5);
        }catch (IllegalArgumentException e){
            System.out.println("Cannot set radius.");
        }
    }
}
