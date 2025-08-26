package week3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class LetterFindingGame {

    public static void main(String[] args) {
        // Scanner & Random nesneleri oluştur--
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // 4 Elemanlı ArrayList oluştur--
        ArrayList<String> letterList = new ArrayList<String>();

        // Rastgele harfler için kullanılıcak alfabe--
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        //ArrayList'e 4 rastgele harf ekle--
        for (int i = 0; i < 4; i++) {
            int rastgeleIndex = random.nextInt(alphabet.length());
            String rastgeleHarf = String.valueOf(alphabet.charAt(rastgeleIndex));
            letterList.add(rastgeleHarf);
        }

        // Baslangıç listesini göster--
        System.out.println("Başlangıç listesi: " + letterList);
        System.out.println("Harf Bulma Oyununa Hoş Geldiniz!");
        System.out.println("4 farklı harf giriniz.\n");

        // 4 kez kullanıcıdan harf al--
        for (int i = 0; i <= 4; i++) {
            System.out.print(i + ". harfi girdiniz: ");
            String enteredLetter = scanner.nextLine().toUpperCase();

            // Sadece tek harf girildiğinden emin ol--
            if (enteredLetter.length() != 1 || !Character.isLetter(enteredLetter.charAt(0))) {
                System.out.println("Lütfen sadece bir harf giridiniz!");
                i--; // Tekrar dene--
                continue;
            }

            // Harf listede var mı kontrol et--
            if (letterList.contains(enteredLetter)) {
                //harf varsa "found" ile değiştir--
                int index = letterList.indexOf(enteredLetter);
                letterList.set(index, "found");
                System.out.println("- Harf Bulundu! '" + enteredLetter + "' --> 'found' olarak değiştirildi.");
            } else {
                // Harf yoksa listeye ekle--
                letterList.add(enteredLetter);
                System.out.println("- Harf listede yok, listeye eklendi: " + enteredLetter);
            }

            // Güncel liste durumunu göster--
            System.out.println("Güncel liste: " + letterList + "\n");
        }

        // Final listesini yazdır--
        System.out.println("=== OYUN SONU ===");
        System.out.println("Son liste durumu: " + letterList);
        System.out.println("Toplam eleman sayısı: " + letterList.size());

        // Scanner'ı kapat--
        scanner.close();
    }
}
