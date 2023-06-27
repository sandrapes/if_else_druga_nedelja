import java.util.Scanner;

public class Zadatak14_ToyStore {

    public static void main(String[] args) {

        // Sophie has a toy store. She receives a large order that she must fulfill.
        // With the money she will earn, she wants to go on a trip.
        //Toy prices:
        //•	Puzzle - 2.60 USD.
        //•	Talking doll - 3 USD.
        //•	Teddy bear - 4.10 USD.
        //•	Minion - 8.20 USD.
        //•	Truck - 2 USD.
        //If the ordered toys are 50 or more, the store makes a 25% discount on the total price.
        // Sophie must give 10% of the earned money for the rent of the store.
        // Calculate whether the money will be enough for her to go on a trip.

        //6 lines are read from the console:
        //1.	Price of the trip – floating-point in the interval [1.00 … 10000.00]
        //2.	Number of puzzles – integer in the interval [0… 1000]
        //3.	Number of talking dolls - integer in the interval [0 … 1000]
        //4.	Number of teddy bears - integer in the interval [0 … 1000]
        //5.	Number of minions - integer in the interval [0 … 1000]
        //6.	Number of trucks - integer in the interval [0 … 1000]

        Scanner sc = new Scanner(System.in);

        double tripPrice = Double.parseDouble(sc.nextLine());
        int puzzle = Integer.parseInt(sc.nextLine());
        int doll = Integer.parseInt(sc.nextLine());
        int teddybear = Integer.parseInt(sc.nextLine());
        int minion = Integer.parseInt(sc.nextLine());
        int truck = Integer.parseInt(sc.nextLine());


        double PUZZLE = 2.60;
        double DOLL = 3;
        double TEDDY = 4.10;
        double MINION = 8.20;
        double TRUCK = 2;

        double p = PUZZLE * puzzle;
        double d = doll * DOLL;
        double t = teddybear * TEDDY;
        double m = MINION * minion;
        double tr = truck * TRUCK;


        int order = puzzle + doll + teddybear + minion + truck;
        double earned = p + d + t + m + tr;



        if (order >= 50) {
            earned = earned - (earned * 25.0 / 100);
        }

        double rent = earned * 10.0 / 100;

        double earnedTotal = earned - rent;

        double left = 0;
        double needed = 0;

        if (earnedTotal >= tripPrice) {
            left = earnedTotal - tripPrice;
            System.out.printf("Yes! %.2f USD left.", left);
        }
            else {
                needed = tripPrice - earnedTotal;
            System.out.printf("Not enough money! %.2f USD needed.", needed);

        }











    }
}
