
import java.util.Scanner;

public class Zadatak16_WorldSwimmingRecord {

    public static void main(String[] args) {

        // Oliver decides to improve the World Record for long-distance swimming.
        // On the console, we type: the record that Oliver has to improve, the distance in meters he has to swim,
        // and the time in seconds for which he swims a distance of 1 m.
        // To write a program that calculates whether he has done the record, it must be considered that:
        // the resistance of the water slows him down every 15 m by 12.5 seconds.
        // After calculating how many seconds Oliver will slow down,
        // the result should be rounded down to the nearest integer number.
        //Calculate the time in seconds for which Ivan will swim the distance and the difference
        // from the World Record.

        //3 lines are read from the console:
        //1.	The records in seconds – a floating-point number in the interval [0.00 … 100000.00]
        //2.	The distance in meters – a floating-point number in the interval [0.00 … 100000.00]
        //3.	The time in seconds for which he swims 1 meter - a floating-point number in the interval [0.00 … 1000.00]

        //Printing the console depends on the result:
        //•	If Oliver has improved the World Record (his time is less than the record) we print:
        //o	"Yes, he succeeded! The new world record is {time of Oliver} seconds."
        //•	If he has NOT improved the record (his time is greater than or equal to the record) we print:
        //o	"No, he failed! He was {needed seconds} seconds slower."
        //The result must be formatted to the second decimal symbol.

        Scanner sc = new Scanner(System.in);

        double recordHeWantsToImprove = Double.parseDouble(sc.nextLine());
        double distanceHeSwimsInMeters = Double.parseDouble(sc.nextLine());
        double timeForWhichHeSwims1Meter = Double.parseDouble(sc.nextLine());

        // racunamo koliko mu vremena treba za celu tu distancu, bez usporenja
        double noResistanceTime = distanceHeSwimsInMeters * timeForWhichHeSwims1Meter;

        // onda racunamo koliko je usporenje
        double ResistanceTime = Math.floor(distanceHeSwimsInMeters / 15) * 12.5;
        // ovde zaokruzujemo jer on na svakih celih 15m dobija usporenje, znaci, taj deo mora zajedno

        // da bismo dobili konacan rezultat, moramo da na celokupno vreme dodamo usporenje. Posto je on sporiji za
        // toliko i toliko mi dodajemo taj broj celokupnom vremenu
        double total = noResistanceTime + ResistanceTime;

        if (total > recordHeWantsToImprove) {
            double needed = total - recordHeWantsToImprove;
            System.out.printf("No, he failed! He was %.2f seconds slower.", needed);
        } else {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", total);
        }




    }
}
