import java.util.Scanner;

public class Zadatak02_GreaterNumber {

    public static void main(String[] args) {

        // Write a program that reads two integers entered by the user and prints the larger of the two.

        Scanner sc = new Scanner(System.in);

        int first = Integer.parseInt(sc.nextLine());
        int second = Integer.parseInt(sc.nextLine());

        if (first > second) {
            System.out.println(first);
        } else {
            System.out.println(second);
        }


    }
}
