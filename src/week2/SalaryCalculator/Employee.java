package week2.SalaryCalculator;

public class Employee {

    // NİTELİKLER--
    String name;        // ÇALIŞANIN ADI & SOYADI
    double salary;      // MAAŞ
    int workHours;      // HAFTALIK ÇALIŞMA SAATİ
    int hireYear;       // İŞE BAŞLAMA TARİHİ

    // KURUCU METOTLAR--
    public Employee(String name, double salary, int workHours, int hireYear) {
        // PARAMETREYİ SINIF DEĞİŞKENİNE ATIYORUZ
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    // VERGİ HESAPLAMA--
    public double tax() {
        if (this.salary < 1000) {
            return 0; // 1000TL ALTINA VERGİ YOK
        } else {
            return this.salary * 0.03; // MAAŞ'IN %3'Ü KADAR VERGİ
        }
    }

    // BONUS HESAPLAMA--
    public double bonus() {
        if (this.workHours > 40) {
            return (this.workHours - 40) * 30; // MESAİ (1'ER SAAT) 30 TL
        }
        return 0;

    }

    // MAAŞ ARTIŞI HESAPLAMA--
    public double raiseSalary() {
        int yearsWorked = 2021 - this.hireYear; // ÇALIŞMA YILI HESAPLAMA

        if (yearsWorked < 10) {
            return this.salary * 0.05; // %5 ZAM
        } else if (yearsWorked >= 10 && yearsWorked < 20) {
            return this.salary * 0.10; // %10 ZAM
        } else {
            return this.salary * 0.15; // %15 ZAM
        }
    }

    // BİLGİLENDİRME EKRAN ÇIKTISI--
    @Override
    public String toString() {
        double taxAmount = tax();
        double bonusAmount = bonus();
        double raiseAmount = raiseSalary();
        double salaryWithTaxAndBonus = this.salary - taxAmount + bonusAmount;
        double totalSalary = salaryWithTaxAndBonus + raiseAmount;

        return "Adı: " + this.name +
                "\nMaaşı: " + this.salary +
                "\nÇalışma Saati: " + this.workHours +
                "\nBaşlangıç Yılı: " + this.hireYear +
                "\nVergi: " + taxAmount +
                "\nBonus: " + bonusAmount +
                "\nMaaş Artışı: " + raiseAmount +
                "\nVergi ve Bonuslar ile birlikte maaş: " + salaryWithTaxAndBonus +
                "\nToplam Maaş: " + totalSalary;
    }
}
