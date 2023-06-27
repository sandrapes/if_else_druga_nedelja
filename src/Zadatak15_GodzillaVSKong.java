import java.util.Scanner;

public class Zadatak15_GodzillaVSKong {

    public static void main(String[] args) {

        // 5.	Godzilla vs. Kong
        //Filming for the long-awaited film "Godzilla vs. Kong" begins.
        // Screenwriter Adam Wingard asks you to write a program to calculate whether the funds provided
        // are enough to shoot the film.
        // The photos will require a certain number of extras, clothing for each extra, and decor.
        //It is known that:
        //•	The set for the film is worth 10% of the budget.
        //•	For more than 150 extras, there is a 10% discount on clothing.

        //3 lines are read from the console:
        //•	Movie Budget- a floating-point number in the interval [1.00… 1000000.00]
        //•	Number of extras - an inter in the range [1…500]
        //•	Price for clothing of one extra – floating-point in the interval [1.00… 1000.00]

        Scanner sc = new Scanner(System.in);

        double budget = Double.parseDouble(sc.nextLine());
        int extras = Integer.parseInt(sc.nextLine());
        double clothing = Double.parseDouble(sc.nextLine());

        double set = budget * 10.0 / 100;

        double clothingTotal = clothing * extras;

        if (extras > 150) {
            clothingTotal = clothingTotal - (clothingTotal * 10.0 / 100);

        }


        double totalCost = set + clothingTotal;

        double left = budget - totalCost;
        double needed = totalCost - budget;

        if (totalCost > budget ) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f USD more.", needed);
        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f USD left.", left);
        }

    }
}
