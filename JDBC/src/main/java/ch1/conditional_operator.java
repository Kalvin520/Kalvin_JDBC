package ch1;

public class conditional_operator {
    public static void main(String[] args) {
        int age = 20;
        //below 14 無行為能力
        //14-18 or 80 限制行為能力
        //else 18-80 完全行為能力
        if (age < 14) {
            System.out.println("妳屬於 無行為能力");
        }
        else if ((age >= 14 && age < 18) || age >= 80){
            System.out.println("妳屬於 限制行為能力");
        }
        else{
            System.out.println("妳屬於 完全行為能力");
        }
    }
}
