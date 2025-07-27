package week1;

import java.util.Scanner;

public class CinZodyagiHesaplama {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan Doğum Yılı İstendi.
        System.out.println("Doğum Yılınızı Giriniz: ");
        int dogumYili = input.nextInt();

        // %12'ye göre Zodyak Burcunu Hesapla
        int result = dogumYili % 12;
        String zodyak = "";

        switch (result) {

            case 0:
                zodyak = "Maymun";
                break;
            case 1:
                zodyak = "Horoz";
                break;
            case 2:
                zodyak = "Köpek";
                break;
            case 3:
                zodyak = "Domuz";
                break;
            case 4:
                zodyak = "Fare";
                break;
            case 5:
                zodyak = "Öküz";
                break;
            case 6:
                zodyak = "Kaplan";
                break;
            case 7:
                zodyak = "Tavşan";
                break;
            case 8:
                zodyak = "Ejderha";
                break;
            case 9:
                zodyak = "Yılan";
                break;
            case 10:
                zodyak = "At";
                break;
            case 11:
                zodyak = "Koyun";
                break;

        }

            System.out.println("Çin Zodyağı Burcunuz: " + zodyak);

        input.close();
    }
}