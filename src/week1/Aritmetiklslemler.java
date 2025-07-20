package week1;

import java.util.Scanner;

public class Aritmetiklslemler {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //  Kullanıcıdan 3 Sayı Alma

        System.out.println("Birinci sayıyı giriniz (a): ");
        int a = input.nextInt();

        System.out.println("İkinci sayıyı giriniz (b): ");
        int b = input.nextInt();

        System.out.println("Üçüncü sayıyı giriniz (c): ");
        int c = input.nextInt();

        // Verilen İşlem Önceliğine Göre Hesapla

        int sonuc = a + (b * c) - b;

        // Sonucu Ekrana Yazdır
        System.out.println("Sonuç: " + sonuc);

        input.close();

    }
}
