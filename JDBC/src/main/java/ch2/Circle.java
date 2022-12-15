package ch2;
public class Circle {

    // i's scope is the whole Circle.java
    private int i;
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




    public void setI(){
        i = 100; // i assignment

        //int i = 100;
        // i's scope is inside the method setI()
    }

    public void accessI(){
        System.out.println(i);
    }

}
