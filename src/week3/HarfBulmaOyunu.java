package week3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class HarfBulmaOyunu {

    public static void main(String[] args) {
        // Scanner & Random nesneleri oluştur--
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // 4 Elemanlı ArrayList oluştur--
        ArrayList<String> harfListesi = new ArrayList<String>();

        // Rastgele harfler için kullanılıcak alfabe--
        String alfabe = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        //ArrayList'e 4 rastgele harf ekle--
        for (int i = 0; i < 4; i++) {
            int rastgeleIndex = random.nextInt(alfabe.length());
            String rastgeleHarf = String.valueOf(alfabe.charAt(rastgeleIndex));
            harfListesi.add(rastgeleHarf);
        }

        // Baslangıç listesini göster--
        System.out.println("Başlangıç listesi: " + harfListesi);
        System.out.println("Harf Bulma Oyununa Hoş Geldiniz!");
        System.out.println("4 farklı harf giriniz.\n");

        // 4 kez kullanıcıdan harf al--
        for (int i = 0; i <= 4; i++) {
            System.out.print(i + ". harfi girdiniz: ");
            String girilenHarf = scanner.nextLine().toUpperCase();

            // Sadece tek harf girildiğinden emin ol--
            if (girilenHarf.length() != 1 || !Character.isLetter(girilenHarf.charAt(0))) {
                System.out.println("Lütfen sadece bir harf giridiniz!");
                i--; // Tekrar dene--
                continue;
            }

            // Harf listede var mı kontrol et--
            if (harfListesi.contains(girilenHarf)) {
                //harf varsa "found" ile değiştir--
                int index = harfListesi.indexOf(girilenHarf);
                harfListesi.set(index, "found");
                System.out.println("- Harf Bulundu! '" + girilenHarf + "' --> 'found' olarak değiştirildi.");
            } else {
                // Harf yoksa listeye ekle--
                harfListesi.add(girilenHarf);
                System.out.println("- Harf listede yok, listeye eklendi: " + girilenHarf);
            }

            // Güncel liste durumunu göster--
            System.out.println("Güncel liste: " + harfListesi + "\n");
        }

        // Final listesini yazdır--
        System.out.println("=== OYUN SONU ===");
        System.out.println("Son liste durumu: " + harfListesi);
        System.out.println("Toplam eleman sayısı: " + harfListesi.size());

        // Scanner'ı kapat--
        scanner.close();
    }
}
