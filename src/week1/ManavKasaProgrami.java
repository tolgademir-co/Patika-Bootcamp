package week1;

import java.util.Scanner;

public class ManavKasaProgrami {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double Armut = 2.14;
        double Elma = 3.67;
        double Domates = 1.11;
        double Muz = 0.95;
        double Patlıcan = 5.00;

        System.out.println("Armut Kaç Kilo?");
        double armutKG = input.nextDouble();

        System.out.println("Elma Kaç Kilo?");
        double elmaKG = input.nextDouble();

        System.out.println("Domates Kaç Kilo?");
        double domatesKG = input.nextDouble();

        System.out.println("Muz Kaç Kilo?");
        double muzKG = input.nextDouble();

        System.out.println("Patlıcan Kaç Kilo?");
        double patlıcanKG = input.nextDouble();

        double toplamTutar = (armutKG * Armut) + (elmaKG * Elma) + (domatesKG * Domates) + (muzKG * Muz) + (patlıcanKG * Patlıcan);
        System.out.printf("Toplam Tutar: %.2f TL\n", toplamTutar);

        input.close();
    }
}
