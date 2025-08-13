package week2.SalaryCalculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // KULLANICI'DAN BİLGİLERİ ALMA--
        System.out.print("Çalışanın Adını giriniz: ");
        String name = scanner.nextLine();

        System.out.print("Maaşını giriniz: ");
        double salary = scanner.nextDouble();

        System.out.print("Haftalık çalışma saatini giriniz: ");
        int workHours = scanner.nextInt();

        System.out.print("İşe başlangıç yılını giriniz: ");
        int hireYear = scanner.nextInt();

        // EMPLOYEE NESNESİNİ OLUŞTUR--
        Employee employee = new Employee(name, salary, workHours, hireYear);

        // ÇIKTI ÜST PANEL--
        System.out.println("\n---- ÇALIŞAN BİLGİLERİ ----");
        System.out.println(employee.toString());

        scanner.close();
    }
}
