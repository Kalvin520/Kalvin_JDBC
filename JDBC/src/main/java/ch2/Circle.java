package ch2;
public class Circle {
    public double radius1;
    //Constructor method hava "method overloading"

    public Circle(){
        radius1 = 1.0;
    }

    public Circle(double newRadius) {
        radius1 = newRadius;
    }

    //encapsulation
   // double radius;


    public double getArea(){
        return Math.PI * radius1 * radius1;
    }
}
