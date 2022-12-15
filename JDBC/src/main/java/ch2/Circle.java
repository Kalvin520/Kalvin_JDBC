package ch2;
public class Circle {

    // i's scope is the whole Circle.java

    private int i;

    // fields are usually private

    private double radius2;
    double radius1;
    //Constructor method hava "method overloading"


     private static final double PI = 3.14;

    public Circle(){
        this(1.0);
    }

    public Circle(double radius1) {
        this.radius1 = radius1;
    }


    // method are usually public

    public double getRadius2(){
        return this.radius2 ;
    }



    //encapsulation
   // double radius;
    public double getArea(){
        return Circle.PI* Math.pow(this.radius1,2);

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
