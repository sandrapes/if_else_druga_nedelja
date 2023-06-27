import java.util.Scanner;

public class Zadatak03_EvenOrOdd {
    public static void main(String[] args) {

        // Write a program that reads an integer entered by the user and prints whether it is even or odd.

        Scanner sc = new Scanner(System.in);

        int first = Integer.parseInt(sc.nextLine());

        if (first % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");}


    }
}
