import java.util.Scanner;

public class Zadatak17_ComputerShopping {

    public static void main(String[] args) {

        // Peter wants to buy N video cards, M CPUs, and P number of RAM.
        // If the number of video cards is greater than that of the processors, he receives a 15% discount
        // on the final bill. The following prices apply:
        //•	Video card - 250 USD for one.
        //•	CPU - 35% from the total price of purchased video cards.
        //•	RAM - 10% from the total price of purchased video cards.
        //Calculate the amount needed to purchase the materials and calculate whether the budget will be enough.

        //4 lines are read from the console:
        //•	Peter’s budget – a floating-point number in the interval [0.0…100000.0]
        //•	Number of video cards – an integer in the interval [0…100]
        //•	Number of CPUs – an integer in the interval [0…100]
        //•	Number of RAM – an integer in the interval [0…100]

        Scanner sc = new Scanner(System.in);

        double budget = Double.parseDouble(sc.nextLine());
        int VCNumber = Integer.parseInt(sc.nextLine());
        int CPUNumber = Integer.parseInt(sc.nextLine());
        int RAMNumber = Integer.parseInt(sc.nextLine());

        int VC = 250;
        double CPU = (VC * VCNumber) * 35.0 / 100;
        double RAM = (VC * VCNumber) * 10.0 / 100;

        double total = (VC * VCNumber) + (CPU * CPUNumber) + (RAMNumber * RAM);

        double discount = total * 15.0 /100;

        if (VCNumber > CPUNumber) {
             total = total - discount;
        }

        double left = budget - total;
        double needed = total - budget;

        if (budget >= total) {

            System.out.printf("You have %.2f USD left!", left);
        } else {

            System.out.printf("Not enough money! You need %.2f USD more!", needed);
        }


    }
}
