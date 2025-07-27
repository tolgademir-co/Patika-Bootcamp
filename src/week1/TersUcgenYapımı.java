package week1;

import java.util.Scanner;

public class TersUcgenYapımı {

    /* ÖRNEK (PROGRAMI DAHA İYİ ANLAMAMIZ İÇİN)

    *********   1           0               9
     *******    2           1               7
      *****     3           2               5
       ***      4           3               3
        *       5           4               1

              i(Değer)    Boşluk(Sayısı)    Yıldız(Sayısı)

     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Kullanıcıdan Veri Almaya Gereken Komut Satırı-

        // Kullanıcının Giriceği Sayı'nın Komut Satırı-
        System.out.print("Basamak Sayısı Giriniz: ");
        int number = scanner.nextInt();

        // Her Yıldıza Boşlukları Yazdıran Komut Satırı-
        for (int i = 1; i <= number; i++) {
            for (int j = 0; j <= (i - 1); j++) {
                System.out.print(" ");
            }
            // Yıldızları Yazdıran Komut Satırı-
            for (int k = 1; k <= 2 * (number - i) + 1; k++) {
                System.out.print("*");
            }
            System.out.println(); // Yeni Satıra Geçmesini Sağlıyor.
        }
        scanner.close();
    }
}