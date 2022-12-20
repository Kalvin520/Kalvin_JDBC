package ch2.Object_oriented_Programming;

import java.util.ArrayList;

public class polymor {
    public static void main(String[] args) {
        People student1 = new Student("kalvin",18, "Taiwan", 99);
        People student2 = new Student("wilson",18, "Taiwan", 60);
        People teacher1 = new Teacher("Mike",24, "Taiwan", "CS");


        //array
        People[] people = new People[10];
        people[0] = student1;
        people[1] = student2;
        people[2] = teacher1;

        for (int i = 0; i < 3; i++) {
            System.out.println(people[i].name);
        }


        //ArrayList
        ArrayList<People> people1 = new ArrayList<>();
        people1.add(student1);
        people1.add(student2);
        people1.add(teacher1);

        for (int i = 0; i < 3; i++) {
            System.out.println(people1.get(i).name);
        }
    }
}
