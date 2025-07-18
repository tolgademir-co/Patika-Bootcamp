package week1;

import java.util.Scanner;

public class ArtikYilHesaplama {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcının Giriceği Yıl.
        System.out.print("Yıl giriniz: ");
        int yil = input.nextInt();

        boolean artikYil;

        // Artık Yıl Hesaplama
        if ((yil % 400 == 0) || ((yil % 4 == 0) && (yil % 100 != 0))) {
            artikYil = true;
        } else {
            artikYil = false;

        }

        // Sonucu Yazdır.
        if (artikYil) {
            System.out.println(yil + " bir artık yıldır.");
        } else {
            System.out.println(yil + " bir artık yıldır değildir.");
        }

        input.close();

    }
}
