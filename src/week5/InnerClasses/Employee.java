package week5.InnerClasses;

public class Employee {
    // Çalışan temel bilgileri
    private String firstName;
    private String lastName;
    private int employeeId;

    // İç sınıf referansı
    private ContactInfo contactInfo;

    // Constructor
    public Employee(String firstName, String lastName, int employeeId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeId = employeeId;
        this.contactInfo = new ContactInfo(); // İç sınıf örneği oluştur
    }

    // İletişim bilgilerini ayarlayan metot
    public void setContactInfo(String phoneNumber, String email) {
        this.contactInfo.setPhoneNumber(phoneNumber);
        this.contactInfo.setEmail(email);
    }

    // Çalışan bilgilerini gösteren metot
    public void displayEmployeeInfo() {
        System.out.println("=== Çalışan Bilgileri ===");
        System.out.println("Ad: " + firstName);
        System.out.println("Soyad: " + lastName);
        System.out.println("Çalışan ID: " + employeeId);

        // İç sınıftaki iletişim bilgilerini göster
        contactInfo.displayContactInfo();
    }

    // Getter metodları
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    // ========== İÇ SINIF (INNER CLASS) ==========
    // Bu sınıf Employee sınıfının İÇİNDE tanımlandığı için Inner Class'tır
    public class ContactInfo {
        private String phoneNumber;
        private String email;

        // Default constructor
        public ContactInfo() {
            this.phoneNumber = "Telefon bilgisi girilmemiş";
            this.email = "E-posta bilgisi girilmemiş";
        }

        // Parametreli constructor
        public ContactInfo(String phoneNumber, String email) {
            this.phoneNumber = phoneNumber;
            this.email = email;
        }

        // İletişim bilgilerini gösteren metot
        public void displayContactInfo() {
            System.out.println("--- İletişim Bilgileri ---");
            System.out.println("Telefon: " + phoneNumber);
            System.out.println("E-posta: " + email);
        }

        // Setter metodları
        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        // Getter metodları
        public String getPhoneNumber() {
            return phoneNumber;
        }

        public String getEmail() {
            return email;
        }

        // Dış sınıfın bilgilerine erişim örneği
        public void displayEmployeeWithContact() {
            System.out.println("İletişim sahibi: " + firstName + " " + lastName);
            System.out.println("Telefon: " + phoneNumber);
            System.out.println("E-posta: " + email);
        }
    }
}
