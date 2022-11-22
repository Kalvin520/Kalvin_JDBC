import java.text.DecimalFormat;
import java.util.Scanner;

public class BMI {

    private static final DecimalFormat DF = new DecimalFormat("0.00");

    public static void main(String[] args) {
        // BMI calculator (kg / m^2)
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入您的體重(kg)：");
        double weight = scanner.nextDouble();//利用scanner掃瞄器鍵入鍵盤輸入值

        System.out.print("請輸入您的身高(cm):");
        double height = scanner.nextDouble() / 100;

        double BMI = Double.parseDouble(DF.format(weight / (height * height)));
        System.out.println("您的BMI數值為:" + BMI);
    }
}
