package week1;

import java.util.Scanner;

public class SayılarınMinveMaxDegeriniBulma {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Kullanıcıdan Veri Almaya Gereken Komut Satırı-

        // Kullanıcının Giriceği 4 Sayı'nın Komut Satırı-
        System.out.print("1. Sayıyı Giriniz: ");
        int num1 = scanner.nextInt();

        System.out.print("2. Sayıyı Giriniz: ");
        int num2 = scanner.nextInt();

        System.out.print("3. Sayıyı Giriniz: ");
        int num3 = scanner.nextInt();

        System.out.print("4. Sayıyı Giriniz: ");
        int num4 = scanner.nextInt();

        // En Ufak ve En Büyük Değerleri Gösteren Komut Satırı-
        int smallNumber = num1;
        int bigNumber = num1;

        // En Küçük Sayı Bulma Komut Satırı-
        if (num2 < smallNumber) smallNumber = num2;
        if (num3 < smallNumber) smallNumber = num3;
        if (num4 < smallNumber) smallNumber = num4;

        // En Büyük Sayı Bulma Komut Satırı-
        if (num2 > bigNumber) bigNumber = num2;
        if (num3 > bigNumber) bigNumber = num3;
        if (num4 > bigNumber) bigNumber = num4;

        // Sonuçları Ekrana Yazdıran Komut Satırı-
        System.out.println("Girdiniz Sayılar: " + num1 + ", " + num2 + ", " + num3 + ", " + num4);
        System.out.println("En Küçük Sayı: " + smallNumber);
        System.out.println("En Büyük Sayı: " + bigNumber);

        scanner.close();
    }
}