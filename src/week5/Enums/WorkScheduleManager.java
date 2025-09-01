package week5.Enums;

import java.util.Scanner;

public class WorkScheduleManager {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Kullanıcı'dan veri alır

        // Başlık çıktısı
        System.out.println(" === ÇALIŞMA PROGRAMI UYGULAMASI ===");
        System.out.println("1. SUNDAY 2. MONDAY 3. TUESDAY 4. WEDNESDAY 5. THURSDAY 6. FRIDAY 7. SATURDAY");
        System.out.println(); // Bir satır boşluk bırakır
        System.out.print("Bir gün giriniz (Sayı Girmeyin): ");
        String inputDay = scanner.nextLine().toUpperCase();

        try {
            // Kullanıcı'nın girdiği String -> Enum değerine dönüştürüyor
            Day selectedDay = Day.valueOf(inputDay);
            // Formatlı ekran çıktısı
            System.out.println("\n----------------------------");
            System.out.println("Gün           : " + selectedDay);
            System.out.println("Çalışma Saati : " + selectedDay.getWorkHours());
            System.out.println("-----------------------------");
        } catch (IllegalArgumentException e) {
            // Geçersiz && Bilgilendirme!
            System.out.println("\nGeçersiz gün girdiniz! Lütfen MONDAY, TUESDAY,FRIDAY gibi giriniz.");
        }
        scanner.close(); // Scanner kapatıldı.
    }
}
