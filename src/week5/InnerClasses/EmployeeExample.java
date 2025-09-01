package week5.InnerClasses;

import java.util.Scanner;

public class EmployeeExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Çalışan Yönetim Sistemi ===\n");

        // Önceden kayıtlı çalışanlar oluştur
        Employee[] preRegisteredEmployees = new Employee[2];

        // 1. Önceden kayıtlı çalışan
        preRegisteredEmployees[0] = new Employee("Tolga", "Demir", 1001);
        preRegisteredEmployees[0].setContactInfo("0555-123-4567", "tolga@patika.com");

        // 2. Önceden kayıtlı çalışan
        preRegisteredEmployees[1] = new Employee("Serra", "Demir", 1002);
        preRegisteredEmployees[1].setContactInfo("0532-987-6543", "serra@patika.com");

        // Önceden kayıtlı çalışanları göster
        System.out.println("=".repeat(50));
        System.out.println("=== SİSTEMDE KAYITLI ÇALIŞANLAR ===");
        System.out.println("=".repeat(50));
        for (int i = 0; i < preRegisteredEmployees.length; i++) {
            System.out.println((i + 1) + ". " + preRegisteredEmployees[i].getFirstName() + " " +
                    preRegisteredEmployees[i].getLastName() + " (ID: " +
                    preRegisteredEmployees[i].getEmployeeId() + ")");
        }
        System.out.println("-".repeat(50));

        System.out.println("Sistemde toplam " + preRegisteredEmployees.length + " çalışan kayıtlıdır.");

        // Kullanıcıdan ek çalışan sayısını al
        System.out.print("\nKaç yeni çalışan bilgisi eklemek istiyorsunuz: ");
        int newEmployeeCount = scanner.nextInt();
        scanner.nextLine(); // Buffer temizleme

        // Toplam çalışan dizisi oluştur (önceki + yeni)
        Employee[] employees = new Employee[2 + newEmployeeCount];

        // Önceden kayıtlı çalışanları kopyala
        employees[0] = preRegisteredEmployees[0];
        employees[1] = preRegisteredEmployees[1];

        // Yeni çalışanlar için bilgi al
        for (int i = 0; i < newEmployeeCount; i++) {
            System.out.println("\n--- " + (i + 3) + ". Çalışan Bilgileri (Yeni Kayıt) ---");

            // Temel bilgileri al
            System.out.print("Adını girin: ");
            String firstName = scanner.nextLine();

            System.out.print("Soyadını girin: ");
            String lastName = scanner.nextLine();

            System.out.print("Çalışan ID'sini girin: ");
            int employeeId = scanner.nextInt();
            scanner.nextLine(); // Buffer temizleme

            // Çalışan oluştur (dizinin 2. indeksinden itibaren)
            employees[i + 2] = new Employee(firstName, lastName, employeeId);

            // İletişim bilgilerini al
            System.out.print("Telefon numarasını girin: ");
            String phoneNumber = scanner.nextLine();

            System.out.print("E-posta adresini girin: ");
            String email = scanner.nextLine();

            // İletişim bilgilerini ayarla
            employees[i + 2].setContactInfo(phoneNumber, email);

            System.out.println(" " + firstName + " " + lastName + " başarıyla kaydedildi!");
        }

        // Çalışan listesi göster ve seçim yaptır
        System.out.println("\n" + "=".repeat(50));
        System.out.println("=== KAYITLI ÇALIŞANLAR LİSTESİ ===");
        System.out.println("=".repeat(50));

        // Çalışanları numaralı liste halinde göster
        for (int i = 0; i < employees.length; i++) {
            System.out.println((i + 1) + ". " + employees[i].getFirstName() + " " +
                    employees[i].getLastName() + " (ID: " + employees[i].getEmployeeId() + ")");
        }

        // Kullanıcıdan çalışan seçimi al
        while (true) {
            System.out.print("\nDetaylarını görmek istediğiniz çalışanın numarasını seçin (1-" +
                    employees.length + ") veya çıkmak için 0: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 0) {
                System.out.println("Program sonlandırılıyor...");
                scanner.close();
                return;
            }
            else if (choice >= 1 && choice <= employees.length) {
                // Seçilen çalışanın detaylarını göster
                System.out.println("\n" + "=".repeat(40));
                System.out.println("=== SEÇİLEN ÇALIŞAN DETAYLARI ===");
                System.out.println("=".repeat(40));
                employees[choice - 1].displayEmployeeInfo();
                System.out.println("=".repeat(40));
            }
            else {
                System.out.println("Geçersiz seçim! Lütfen 1-" + employees.length + " arası bir sayı girin.");
            }
        }
    }
}