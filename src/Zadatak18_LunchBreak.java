import java.util.Scanner;

public class Zadatak18_LunchBreak {

    public static void main(String[] args) {

        //During the lunch break, you want to watch an episode of your favorite series.
        // Your task is to write a program that will find out if you have enough time to watch the episode.
        // During the break, you spend time for lunch and time for rest.
        // Lunchtime will be 1/8 of the break time, and rest time will be 1/4 of the break time.

        //3 lines are read from the console:
        //1.	Name of the series - a string
        //2.	Episode duration - an integer in the range [10… 90]
        //3.	Duration of the break - an integer in the range [10… 120]

        Scanner sc = new Scanner(System.in);

        String series = sc.nextLine();
        int episodeDuration = Integer.parseInt(sc.nextLine());
        int breakDuration = Integer.parseInt(sc.nextLine());

        double timeForLunch = breakDuration / 8.0;
        double timeForRest = breakDuration / 4.0;

        double timeLeft = breakDuration - timeForLunch - timeForRest;

        ///System.out.println(timeLeft);

        if (timeLeft >= episodeDuration) {
            double left = timeLeft - episodeDuration;
            left = Math.ceil(left);
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", series, left);
        } else {
            double needed = episodeDuration - timeLeft;
            needed = Math.ceil(needed);
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", series, needed);
        }






    }
}
