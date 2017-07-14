import java.util.Random;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random dice = new Random();
        int number;
        int roll = 1;
        String answer = "yes";

        System.out.println("Welcome to the Grand Circus Casino!");

       do {
           System.out.print("\nHow many sides should each die have:");
           int i = scan.nextInt();
           scan.nextLine();

           System.out.println("\nRoll " + roll++ + ":");

           for (int counter = 1; counter <= 2; counter++) {
               number = 1 + dice.nextInt(i);
               System.out.println(number);}

           System.out.println("\nDo you want to continue? (Yes/No)");
           answer = scan.nextLine();

       }while (answer.equalsIgnoreCase("yes"));




    }
}


