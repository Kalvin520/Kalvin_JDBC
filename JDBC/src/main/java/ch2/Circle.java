package ch2;
public class Circle {

    // i's scope is the whole Circle.java
    private int i;
    double radius1;
    //Constructor method hava "method overloading"

    public Circle(){
        this(1.0);
    }

    public Circle(double radius1) {
        this.radius1 = radius1;
    }

    //encapsulation
   // double radius;


    public double getArea(){
        return Math.PI * Math.pow(this.radius1,2);
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
