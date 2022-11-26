package ch1.Game;

import java.util.Random;
import java.util.Scanner;

public class game1 {
    //終極密碼
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        //能猜區間 0~100
        int min = 0;
        int max = 100;
        Random r = new Random();
        int secret = r.nextInt(101) ;
        System.out.println(secret);

        while(true){
            System.out.print("Make a guess (between) " + min + " and " + max + "):");
            int guess = sc1.nextInt();
            if(guess < min || guess > max ){
                System.out.println("Please make a valid guess.");
                continue;
            }
            if(guess == secret) {
                System.out.println("You win!! The secret is " + secret);
                break;
            }else if (guess < secret){
                min = guess;
            } else{
                max = guess;
            }
        }
    }
}
