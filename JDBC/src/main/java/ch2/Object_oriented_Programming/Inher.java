package ch2.Object_oriented_Programming;

public class Inher {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("陳俊吉", 25, "Kaoshung", "Computer Science");
        Teacher teacher2 = new Teacher("鍾毓婷", 26, "Kaoshung", "Chinese");
        Student student1 = new Student("Kalvin", 18, "Kaoshung",100);

        teacher1.teach();
        teacher2.sleep();
        student1.walk();
        student1.sleep();
        student1.learn();

        //Override後的walk
        student1.walk();
        teacher1.walk();

        System.out.println(teacher1.equal(teacher2));
    }

}
