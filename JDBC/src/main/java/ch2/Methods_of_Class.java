package ch2;

import java.util.Scanner;

public class Methods_of_Class {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.radius1);

        Circle circle2 = new Circle(10);
        System.out.println(circle2.radius1);
        System.out.println(circle2.getArea());

        Circle circle3 = new Circle();
        System.out.println(circle3.getArea());


        // Execute scanner class' constructor
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();

        

    }

}
