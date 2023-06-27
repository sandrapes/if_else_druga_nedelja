import java.util.Scanner;

public class WorldSwimmingRadjenoOpet {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double trenutniRekord = Double.parseDouble(sc.nextLine());
        double distancaKojuPliva = Double.parseDouble(sc.nextLine());
        double vremeDaPrepliva1Metar = Double.parseDouble(sc.nextLine());

        double vremeZaPlivanje = vremeDaPrepliva1Metar * distancaKojuPliva;

        double usporenjeNaSvakih15M = Math.floor(distancaKojuPliva / 15) * 12.5;

        double ukupnoVreme = vremeZaPlivanje + usporenjeNaSvakih15M;

        if (ukupnoVreme < trenutniRekord ) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", ukupnoVreme);
        } else {
            double potrebnoSekundi = ukupnoVreme - trenutniRekord;
            System.out.printf("No, he failed! He was %.2f seconds slower.", potrebnoSekundi);
        }


    }
}
