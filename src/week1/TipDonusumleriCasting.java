package week1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TipDonusumleriCasting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // KULANICIDAN VERİ ALMA KOMUT SATIRI--

        int integerInput = 0;
        double doubleInput = 0;

        try {
            // KULLANICI'DAN TAM SAYI AL KOMUT SATIRI--
            System.out.print("Bir Tam Sayı Giriniz: ");
            integerInput = scanner.nextInt();

            // KULLANICI'DAN ONDALIK TAM SAYI AL KOMUT SATIRI--
            System.out.print("Lütfen Bir Ondalık Sayı Giriniz: ");
            doubleInput = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Hatalı Giriş!! Lütfen Sadece Sayısal Değerler Giriniz.");
            return; // PROGRAMI SONLANDIR KOMUT SATIRI--
        }

        // OTOMATİK DÖNÜŞTÜRME.. ÖRN: İNT -> DOUBLE
        double convertedFromInt = integerInput;
        // AÇIK DÖNÜŞTÜRME.. ÖRN: DOUBLE -> İNT
        int convertedFromDouble = (int) doubleInput;

        // SONUÇLARI YAZDIR KOMUT SATIRI--
        printResults(integerInput, doubleInput, convertedFromInt, convertedFromDouble);

        scanner.close();
    }

    /*
    --DÖNÜŞTÜRME SONUÇLARINI YAZDIRAN KOMUT SATIRI--
     */
    private static void printResults(int originalInt, double originalDouble, double intToDouble, int doubleToInt) {

        System.out.println("\n--- Tip Dönüşüm Sonuçları ---");
        System.out.printf("Original Tam Sayı: %d%n", originalInt);
        System.out.printf("Original Ondalık Sayı: %.2f%n", originalDouble);
        System.out.printf("Tam Sayıdan Ondalıklı Sayıya (int -> double): %.2f%n", intToDouble);
        System.out.printf("Ondalıklı Sayıdan Tam Sayıya (double -> int): %d%n", doubleToInt);

    }
}
