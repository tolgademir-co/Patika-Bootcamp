package week2;

import java.util.Scanner;

// HEDEF1 - KULLANICI'DAN 1-10 ARASI BİR TAM SAYIYA GÖRE ' n x n ' BİR ÇARPIM TABLOSU OLUŞTURULACAK.
// HEDEF2 - EXTRA(OPSİYONEL) OLARAK HİZALI ÇIKTI İSTİYORSAN System.out.printf("%-4d", i*j); İLE BİÇİMLENDİRME YAPILACAK

public class CarpımTablosu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // KULLANICI'DAN VERİ ALMAK İÇİN--

        System.out.print("Üst sınırı giriniz (1-10): ");
        int n = scanner.nextInt(); // KULLANICI'DAN 'N' DEĞERİ ALIR--

        // GEÇERSİZ GİRİŞ HATASI--
        if (n < 1 || n > 10) {
            System.out.println("HATA: Lütfen 1 ile 10 arasında bir tam sayı giriniz!!");
            return; // PROGRAMI DURDURUR--
        }

        System.out.println("\nÇarpım Tablosu:\n");

        // İÇ-İÇE FOR DÖNGÜLERİYLE ÇARPIM TABLOSU ÜRET--
        for (int i = 1; i <= n; i++) {              // SATIR KONTROLÜ--
            for (int j = 1; j <= n; j++) {          // SÜTÜN KONTROLÜ--
                System.out.printf("%-4d", i * j);  // BİÇİMLENDİRİLMİŞ ÇIKTI--
            }
            System.out.println(); // SATIR SONUNA GELDİĞİNDE ALT SATIRA GEÇ--

        }
        scanner.close();
    }
}
