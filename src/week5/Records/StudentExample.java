package week5.Records;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class StudentExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Öğrenci Kayıt Sistemi ===\n");

        // Önceden kayıtlı öğrenciler (örnek veriler)
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Tolga", "Demir", 2023001));
        students.add(new Student("Serra", "Demir", 2023002));
        students.add(new Student("Mahir", "Açık", 2025003));

        // Mevcut öğrencileri göster
        System.out.println("=".repeat(50));
        System.out.println("=== SİSTEMDE KAYITLI ÖĞRENCİLER ===");
        System.out.println("=".repeat(50));
        for (int i = 0; i < students.size(); i++) {
            System.out.println((i + 1) + ". " + students.get(i).getFullName() +
                    " (No: " + students.get(i).studentNumber() + ")");
        }
        System.out.println("=".repeat(50));
        System.out.println("✓ Sistemde toplam " + students.size() + " öğrenci kayıtlıdır.\n");

        // Kullanıcıdan yeni öğrenci sayısını al
        System.out.print("Kaç yeni öğrenci eklemek istiyorsunuz? ");
        int newStudentCount = scanner.nextInt();
        scanner.nextLine(); // Buffer temizleme

        // Yeni öğrenciler ekle
        for (int i = 0; i < newStudentCount; i++) {
            System.out.println("\n--- " + (i + 1) + ". Yeni Öğrenci Kaydı ---");

            try {
                System.out.print("Adını girin: ");
                String firstName = scanner.nextLine();

                System.out.print("Soyadını girin: ");
                String lastName = scanner.nextLine();

                System.out.print("Öğrenci numarasını girin: ");
                int studentNumber = scanner.nextInt();
                scanner.nextLine();

                // Öğrenci numarası benzersizlik kontrolü
                boolean numberExists = students.stream()
                        .anyMatch(s -> s.studentNumber() == studentNumber);

                if (numberExists) {
                    System.out.println("Bu öğrenci numarası zaten kullanılıyor! Farklı bir numara girin.");
                    i--; // Aynı öğrenci için tekrar dene
                    continue;
                }

                // Record oluştur
                Student newStudent = new Student(firstName, lastName, studentNumber);
                students.add(newStudent);

                System.out.println("✓ " + newStudent.getFullName() + " başarıyla kaydedildi!");

            } catch (IllegalArgumentException e) {
                System.out.println("Hata: " + e.getMessage());
                i--; // Hatalı giriş için tekrar dene
            }
        }

        // Tüm öğrenci listesini göster
        System.out.println("\n" + "=".repeat(60));
        System.out.println("=== TÜM ÖĞRENCİ LİSTESİ (ESKİ + YENİ) ===");
        System.out.println("=".repeat(60));

        for (int i = 0; i < students.size(); i++) {
            System.out.println((i + 1) + ". " + students.get(i).getFormattedInfo());
        }

        // Kullanıcıdan öğrenci seçimi al
        while (true) {
            System.out.print("\nDetaylarını görmek istediğiniz öğrencinin numarasını seçin (1-" +
                    students.size() + ") veya çıkmak için 0: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 0) {
                System.out.println("Program sonlandırılıyor...");
                break;
            }
            else if (choice >= 1 && choice <= students.size()) {
                System.out.println();
                students.get(choice - 1).displayStudentInfo();
            }
            else {
                System.out.println("Geçersiz seçim! Lütfen 1-" + students.size() + " arası bir sayı girin.");
            }
        }

        // Record'un özelliklerini test et
        System.out.println("\n" + "=".repeat(60));
        System.out.println("=== RECORD ÖZELLİKLERİ TESTİ ===");
        System.out.println("=".repeat(60));
        testRecordFeatures(students);

        scanner.close();
        System.out.println("\n=== Program Tamamlandı ===");
    }

    // Record'un equals ve hashCode metodlarını test et
    public static void testRecordFeatures(ArrayList<Student> students) {
        if (students.size() >= 2) {
            Student student1 = students.get(0);
            Student student2 = students.get(1);

            // Aynı verilerle yeni Record oluştur
            Student duplicateStudent = new Student(student1.firstName(),
                    student1.lastName(),
                    student1.studentNumber());

            System.out.println("=== EQUALS VE HASHCODE TESTİ ===");
            System.out.println("Öğrenci 1: " + student1);
            System.out.println("Öğrenci 2: " + student2);
            System.out.println("Kopya Öğrenci: " + duplicateStudent);

            System.out.println("\nEquals Testi:");
            System.out.println("student1.equals(student2): " + student1.equals(student2));
            System.out.println("student1.equals(duplicateStudent): " + student1.equals(duplicateStudent));

            System.out.println("\nHashCode Testi:");
            System.out.println("student1.hashCode(): " + student1.hashCode());
            System.out.println("student2.hashCode(): " + student2.hashCode());
            System.out.println("duplicateStudent.hashCode(): " + duplicateStudent.hashCode());

            // Set ile benzersizlik testi
            Set<Student> studentSet = new HashSet<>();
            studentSet.add(student1);
            studentSet.add(student2);
            studentSet.add(duplicateStudent); // Bu eklenmeyecek çünkü student1 ile aynı

            System.out.println("\nSet'te toplam öğrenci sayısı: " + studentSet.size());
            System.out.println("(Kopya öğrenci eklenmedi çünkü student1 ile aynı)");

            System.out.println("\n=== RECORD İMMUTABLE ÖZELLİĞİ ===");
            System.out.println("Record değerleri sadece okunabilir (getter metodları):");
            System.out.println("student1.firstName(): " + student1.firstName());
            System.out.println("student1.lastName(): " + student1.lastName());
            System.out.println("student1.studentNumber(): " + student1.studentNumber());
            System.out.println("Record değerleri değiştirilemez (immutable)!");
        }
    }
}