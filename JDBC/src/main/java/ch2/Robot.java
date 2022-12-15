package ch2;

public class Robot {
    private String name;
    private int yearMade;

    public int getYearMade() {
        return yearMade;
    }

    public void setYearMade(int yearMade) {
        if (yearMade < 1990){
            System.out.println("year made cannot be earlier than 1990.");
        }else if (yearMade > 2022){
            System.out.println("year made not yet come.");
        }else {
            this.yearMade = yearMade;
        }
    }

    //construct
    public Robot (String name, int yearMade){
        this.name = name;
        this.yearMade = yearMade;
    }


    // setter method
    public void setName(String name){
        this.name = name;
    }
    // getter method
    public String getName(){
        return this.name;
    }
}
