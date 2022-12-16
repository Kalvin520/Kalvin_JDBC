package ch2.Inheritance;

public class Inher {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("陳俊吉", 25, "Kaoshung", "Computer Science");
        Teacher teacher2 = new Teacher("鍾毓婷", 25, "Kaoshung", "Chinese");
        Student student1 = new Student("Kalvin", 18, "Kaoshung",100);
        Student student2 = new Student("Qing", 18, "Kaoshung",99 );

        teacher1.teach();
        teacher2.sleep();
        student1.learn();
        student2.walk();
    }

}
