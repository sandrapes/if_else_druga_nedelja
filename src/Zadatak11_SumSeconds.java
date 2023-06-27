import java.util.Scanner;

public class Zadatak11_SumSeconds {

    public static void main(String[] args) {

        // Three athletes finish in a matter of seconds (between 1 and 50).
        // Write a program that reads the times of the competitors in seconds entered by the user and
        // calculates their total time in the format "minutes:seconds".
        // Display the seconds with leading zero (2  "02", 7  "07", 35  "35").

        Scanner sc = new Scanner(System.in);

        int first = Integer.parseInt(sc.nextLine());
        int second = Integer.parseInt(sc.nextLine());
        int third = Integer.parseInt(sc.nextLine());

        int together = first + second + third;
        int min = together / 60;
        int sec = together % 60;


        System.out.printf("%d:%02d", min, sec);


    }
}
