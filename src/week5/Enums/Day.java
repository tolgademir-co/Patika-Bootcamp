package week5.Enums;

public enum Day {

    // Enum sabitlerini tanımlıyoruz - Her gün için çalışma saatleri
    SUNDAY("09:00 - 17:00"),
    MONDAY("09:00 - 17:00"),
    TUESDAY("09:00 - 17:00"),
    WEDNESDAY("09:00 - 17:00"),
    THURSDAY("09:00 - 17:00"),
    FRIDAY("09:00 - 17:00"),
    SATURDAY("09:00 - 17:00");

    // Çalışma saatini tutucak değişken
    private final String workHours;

    // Constructor - Enum sabitleri oluşturulurken çağrılır
    Day(String workHours) {
        this.workHours = workHours;
    }
    // Çalışma saatini döndüren metot
    public String getWorkHours() {
        return workHours;
    }
}