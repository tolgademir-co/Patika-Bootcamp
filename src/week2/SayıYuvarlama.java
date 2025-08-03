package week2;

import java.util.Scanner;

public class SayıYuvarlama {

    /* Kullanıcı'nın girdiği ondalık bir sayıya aşağıdaki gibi ekrana yazdır!!
    1. Aşağı Yuvarlama
    2. Yukarı Yuvarlama
    3. En Yakın Tam Sayı
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // KULANICIDAN VERİ ALMA KOMUT SATIRI--

        System.out.print("Lütfen Bir Ondalık Sayı Geriniz: ");
        double num = scanner.nextDouble(); // KULLANICI'NIN GİRDİĞİ ONDALIKLI SAYI OKUNUYOR--

        int asagiYuvarla = (int) Math.floor(num); // AŞAĞI YUVARLAMA--
        int yukariYuvarla = (int) Math.ceil(num); // YUKARI YUVARLAMA--
        int enYakınTam = (int) Math.round(num); // EN YAKIN TAM SAYIYA YUVARLAMA--

        //SONUÇLARI EKRANA YAZDIR--
        System.out.println("\nOutput: ");
        System.out.println(); // BİR SATIR BOŞLUK BIRAKIR ALT SATIRA GEÇER--
        System.out.println("Aşağı Yuvarlama: " + asagiYuvarla);
        System.out.println("Yukarı Yuvarlama: " + yukariYuvarla);
        System.out.println("En Yakın Tam Sayı: " + enYakınTam);

        scanner.close();
    }
}
