package ch2;

public class Encapsulation {
    public static void main(String[] args) {
        Robot robot = new Robot("Buzz Lightyear", 1998);
        robot.setName("Buzz Lightyear2, 1928");
        System.out.println(robot.getName());

        robot.setYearMade(1999);
        System.out.println(robot.getYearMade());

    }
}
