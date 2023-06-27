import java.util.Scanner;

public class Zadatak06_SpeedInfo {

    public static void main(String[] args) {

        // Write a program that reads the speed (floating-point number) entered by the user and prints speed
        // information.
        // At speed up to 10 (inclusive) print "slow"
        //	At speed between 10 and 50 (inclusive) print "average"
        //	At speed between 50 and 150 (inclusive) print "fast"
        //	At speed between 150 and 1000 (inclusive) print "ultra fast"
        //	At a higher speed print "extremely fast"

        Scanner sc = new Scanner(System.in);

        double speed = Double.parseDouble(sc.nextLine());

        if (speed <= 10) {
            System.out.println("slow");
        } else if (speed <= 50) {
            System.out.println("average");
        } else if ( speed <= 150) {
            System.out.println("fast");
        } else if ( speed <= 1000) {
            System.out.println("ultra fast");
        } else if (speed > 1000) {
            System.out.println("extremely fast");}

    }
}
