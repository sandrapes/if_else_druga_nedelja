import java.util.Scanner;

public class Zadatak13_Time15Minutes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Write a program that reads the hour and minutes of the 24-hour day entered by the user and
        // calculates what time it will be in 15 minutes.
        // Print the result in hours:minutes. The hours are always between 0 and 23,
        // and the minutes are always between 0 and 59.
        // The hours are written in one or two digits.
        // Minutes are always displayed in two digits, with a leading zero when necessary.

        int hour = Integer.parseInt(sc.nextLine());
        int min = Integer.parseInt(sc.nextLine());

        int minIn15 = min + 15;
        int hourIn15 = hour + 0;

        if (minIn15 >= 60) {
            minIn15 = minIn15 % 60;
            hourIn15 = hour + 1;
            if (hour == 23) {
                hourIn15 = 0;
            }

        }
        System.out.printf("%d:%02d", hourIn15, minIn15);







    }
}
