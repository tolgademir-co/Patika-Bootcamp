package week5.Records;

// Record sınıfı - Immutable (değiştirilemez) yapı
public record Student(String firstName, String lastName, int studentNumber) {

    // Compact Constructor - Validation (doğrulama) için
    public Student {
        // İsim ve soyisim boş olamaz kontrolü
        if (firstName == null || firstName.trim().isEmpty()) {
            throw new IllegalArgumentException("Ad boş olamaz!");
        }

        if (lastName == null || lastName.trim().isEmpty()) {
            throw new IllegalArgumentException("Soyad boş olamaz!");
        }

        // Öğrenci numarası pozitif olmalı kontrolü
        if (studentNumber <= 0) {
            throw new IllegalArgumentException("Öğrenci numarası pozitif bir sayı olmalıdır!");
        }

        // Değerleri düzenle (baş ve sondaki boşlukları temizle)
        firstName = firstName.trim();
        lastName = lastName.trim();
    }

    // Öğrenci bilgilerini formatlanmış şekilde döndüren metot
    public String getFormattedInfo() {
        return String.format("Ad Soyad: %s %s | Öğrenci No: %d",
                firstName, lastName, studentNumber);
    }

    // Tam adı döndüren metot
    public String getFullName() {
        return firstName + " " + lastName;
    }

    // Öğrenci bilgilerini detaylı gösteren metot
    public void displayStudentInfo() {
        System.out.println("=== Öğrenci Bilgileri ===");
        System.out.println("Ad: " + firstName);
        System.out.println("Soyad: " + lastName);
        System.out.println("Öğrenci Numarası: " + studentNumber);
        System.out.println("Tam Ad: " + getFullName());
        System.out.println("========================");
    }

    // Record'un otomatik toString metodunu override etme (isteğe bağlı)
    @Override
    public String toString() {
        return String.format("Student[%s %s - %d]", firstName, lastName, studentNumber);
    }

    // Öğrenci numarasına göre karşılaştırma metodu (isteğe bağlı)
    public int compareByStudentNumber(Student other) {
        return Integer.compare(this.studentNumber, other.studentNumber);
    }
}