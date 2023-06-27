import java.util.Scanner;

public class Zadatak04_Password {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Write a program that reads a password (string) entered by the user and checks if the entered
        // password matches the phrase "s3cr3t!P@ssw0rd".
        // In case of coincidence, display "Welcome". In case of discrepancy, display "Wrong password!".

        String password = sc.nextLine();
        String REALPASSWORD = "s3cr3t!P@ssw0rd";

        if ( password.equals(REALPASSWORD)){
            System.out.println("Welcome");
        } else{
            System.out.println("Wrong password!");
        }

        /// ili moze ovako

        /// if ( password.equals("s3cr3t!P@ssw0rd")){
        //            System.out.println("Welcome");
        //        } else{
        //            System.out.println("Wrong password!");
        //        }



    }
}
