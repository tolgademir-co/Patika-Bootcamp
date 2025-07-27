package week1;

import java.util.Scanner;

public class MukemmelSayıBulanProgram {

    /*
    6 bir mükemmel sayıdır. 1,2,3 & 1+2+3= 6
    28 bir mükemmel sayıdır. 1,2,4,7,14 & 1+2+4+7+14= 28
    10 bir mükemmel sayı değildir. 1,2,5 & 1+2+5= 8
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Kullanıcıdan Veri Almaya Gereken Komut Satırı-

        // Kullanıcının Giriceği Sayı'nın Komut Satırı-
        System.out.print("Bir Sayı Giriniz: ");
        int number = scanner.nextInt();

        int toplam = 0;

        // Kendisi hariç pozitif bölenleri bul ve toplama Komut Satırı-
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                toplam += i;
            }
        }
        //Ekran Çıktısını Sağlayan Komut Satırı-
        if (toplam == number) {
            System.out.println(number + " Mükemmel Bir Sayıdır!");
        } else {
            System.out.println(number + " Mükemmel Bir Sayıdır Değildir!");
        }

        scanner.close();
    }
}
