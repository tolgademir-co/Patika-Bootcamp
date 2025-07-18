package week1;

import java.util.Scanner;

public class UcakBiletiFiyatHesaplama {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double km;
        int yas, tip;

        while (true) {
            System.out.print("Mesafeyi (KM) giriniz: ");
            km = input.nextDouble();

            System.out.print("Yaşınızı giriniz: ");
            yas = input.nextInt();

            System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş): ");
            tip = input.nextInt();

            if (km > 0 && yas > 0 && (tip == 1 || tip == 2)) {
                break; // Geçerli veri && Döngüden çık
            } else {
                System.out.println("Hatalı veri girdiniz! Tekrar deneyin.\n");
            }
        }
        //Ekran Çıktısı.
        double toplamFiyat = calculatePrice(km, yas, tip);

        System.out.println("\n----- Bilet Özeti -----");
        System.out.println("Mesafe: " + km + " KM");
        System.out.println("Yaş: " + yas);
        System.out.println("Yolculuk Tipi: " + (tip == 1 ? "Tek Yön" : "Gidiş-Dönüş"));
        System.out.printf("Toplam Bilet Fiyatı: %.2f TL%n", toplamFiyat);

        input.close();
    }

    public static double calculatePrice(double km, int yas, int tip) {
        double birimFiyat = 0.10;
        double toplamFiyat = km * birimFiyat;

        //Yaş İndirimi.
        if (yas < 12) {
            toplamFiyat *= 0.5; // %50 İndirim Uygulandı.
        } else if (yas <= 24) {
            toplamFiyat *= 0.9; // %10 İndirim Uygulandı.
        } else if (yas > 65) {
            toplamFiyat *= 0.7; // %30 İndirim Uygulandı.
        }
        //Yolculuk Tipine Göre indirim.
        if (tip == 2) {
            toplamFiyat *= 2;
            toplamFiyat *= 0.8;
        }

        return toplamFiyat;
    }
}