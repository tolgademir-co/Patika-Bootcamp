package week2;

import java.util.Scanner;

public class AsalSayıBulanProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // KULLANICIDAN VERİ ALMAYA YARIYAN KOMUT SATIRI--

        System.out.print("Bir Sayı Giriniz: ");
        int number = scanner.nextInt(); // GİRİLEN SAYI OKUNUR VE 'NUMBER' DEĞİŞKENİ ATANIR--

        if (number <= 1) { // 0, 1 VE NEGATİF SAYILAR ASAL DEĞİLDİR--
            System.out.println(number + " Sayısı ASAL Değildir !!");
        } else {
            // RECURSİVE METOT ÇAĞRILARAK SAYI'NIN ASAL OLUP OLMADIĞI KONTROL EDİLİR--
            boolean isPrime = isPrimeRecursive(number, 2);

            if (isPrime) {
                System.out.println(number + " Sayısı ASAL'DIR !!");
            } else {
                System.out.println(number + " Sayısı ASAL Değildir !!");
            }
        }
        scanner.close(); // SCANNER NESNESİ KAPATILIR--
    }
    // RECURSİVE OLARAK ASAL SAYI KONTROLÜ YAPAN KOMUT SATIRI--
    public static boolean isPrimeRecursive(int number, int divisor) {
        // EĞER BÖLEN SAYISI, SAYI'NIN YARISINDAN BÜYÜKSE BAŞKA BÖLEN YOKTUR--
        if (divisor > number / 2) {
            return true;
        }
        // EĞER SAYI, BÖLEN İLE KALANSIZ BÖLÜNÜYORSA ASAL DEĞİLDİR--
        if (number % divisor == 0) {
            return false;
        }
        // İKİ DÖNGÜYÜDE SAĞLAMADIYSA KOMUT KENDİNİ TEKRARDAN ÇAĞIRIR--
        return isPrimeRecursive(number, divisor + 1);
    }
}
