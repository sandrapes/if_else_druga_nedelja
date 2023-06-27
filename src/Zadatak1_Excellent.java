import java.util.Scanner;

public class Zadatak1_Excellent {

    public static void main(String[] args) {

        // Write a console program that reads a rating (integer) entered by the user and prints "Excellent!"
        // if the score is 5 or higher.

        Scanner sc = new Scanner(System.in);

        int rating = Integer.parseInt(sc.nextLine());

        if (rating >= 5) {
            System.out.println("Excellent!");
        }



    }
}
