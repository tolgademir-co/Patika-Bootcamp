package week1;

import java.util.Scanner;

public class UçakBiletiFiyatHesaplama {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Gerekli Bilgiler

        //Mesafe ve yaş pozitif, yolculuk tipi 1 veya 2 olmalı; yoksa uyarı ver: "Hatalı Veri Girdiniz !"
        //Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
        //Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
        //Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
        //Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.


        System.out.println("Mesafeyi (KM) giriniz: ");
        double km = input.nextDouble();

        System.out.println("Yaşınızı giriniz: ");
        int yas = input.nextInt();

        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): 1");
        double tip = input.nextDouble();

        double birimFiyat = 0.10;
        double toplamFiyat = km * birimFiyat;

        if (km > 0 && yas > 0 && (tip == 1 || tip == 2)) {

            if (yas < 12) {
                toplamFiyat *= 0.5; // %50 İndirim.
            } else if (yas >= 12 && yas <= 24) {
                toplamFiyat *= 0.9; // %10 İndirim.
            } else if (yas > 65) {
                toplamFiyat *= 0.7; // %30 İndirim.
            }
                if (tip == 2) {
                    toplamFiyat *= 0.8; // %20 İndirim.
                    toplamFiyat *= 2; // Gidiş dönüş olduğu için 2 kat mesafe.
                }

                System.out.println("Toplam bilet fiyatı: " + toplamFiyat + " TL ");
            } else {
                System.out.println("Hatalı veri girdiniz!");

            }
                input.close();
            }
        }