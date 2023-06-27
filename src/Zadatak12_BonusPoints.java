import java.util.Scanner;

public class Zadatak12_BonusPoints {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //An integer is given - the starting number of points.
        // Bonus points are added to it according to the rules described below.
        // Write a program that calculates the bonus points received by the number and the total number of points
        // (number + bonus).

        //•	If the number is up to 100 inclusive, the bonus points are 5.
        //•	If the number is greater than 100, the bonus points are 20% of the number.
        //•	If the number is greater than 1000, the bonus points are 10% of the number.

        //•	Additional bonus points (added separately from the previous ones):
        //	For an even number  + 1 point.
        //	For a number ending in 5  + 2 points.

        int points = Integer.parseInt(sc.nextLine());


        // PRVO ODREDJUJEMO BONUS KOJI JE NEUTRALAN KAD SE SA NJIM SABIRA, ZNACI 0
        double bonus = 0;

        // ONDA ISPISUJEMO SAMO PRVE USLOVE, BONUS SE MENJA KAKO MU SE DODAJE NOVA VREDNOST
        if (points <= 100) {
            bonus = bonus + 5;

        } else if (points <= 1000) {
            bonus = points * 20.0 / 100;

        } else {
            bonus = points * 10.0 / 100;
        }

        // ONDA ISPISUJEMO DODATNI USLOV, TJ. DA LI JE BROJ PARAN
        if (points % 2 == 0) {
            bonus = bonus + 1;
        }


        // ONDA DA LI SE CIFRA ZAVRSAVA NA 5
        if (points % 10 == 5) {
            bonus = bonus + 2;
        }

        System.out.println(bonus);

        // ONDA IZRACUNAMO UKUPNU SUMU, STO JE BROJ PLUS BONUS
        double allTogether = points + bonus;

        System.out.println(allTogether);

// BONUS SE MENJA U ZAVISNOSTI OD TOGA KOJU MU VREDNOST DODAJEMO,ZNACI AKO MU DODAMO 1 ONDA JE ON BONUS PLUS 1
        //AKO POSLE TOGA DODAMO 2 NA TU VREDNOST MU SE DODAJE 2 ITD




    }
}
