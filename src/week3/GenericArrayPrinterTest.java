package week3;

public class GenericArrayPrinterTest {

    public static <T> void printArray(T[] array) { // Generic metot tanımı

        // Dizideki her elemanı yazdır
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            // Son eleman değilse boşluk ekle
            if (i < array.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println(); // Yeni satıra geç

    }

    // Altarnatif enhanced for-loop kullanımı
    public static <T> void printArrayEnhanced(T[] array) {
        boolean first = true;
        for (T element : array) {
            if (!first) {
                System.out.print(" ");
            }
            System.out.print(element);
            first = false;
        }
        System.out.println(); // Yeni satıra geç
    }

    // Test metodu
    public static void main(String[] args) {
        // Integer dizisi
        Integer[] intArray = {1, 2, 3, 4, 5};
        // String dizisi
        String[] strArray = {"Java", "Generics", "Ödev"};
        // Double dizisi
        Double[] doubleArray = {1.5, 2.8, 3.9, 4.2};
        // Character dizisi
        Character[] charArray = {'A', 'B', 'C', 'D'};

        // Metotları test et
        System.out.println("=== Temel printArray Metodu ===");
        printArray(intArray);
        printArray(strArray);
        printArray(doubleArray);
        printArray(charArray);

        System.out.println("\n=== Enhanced For Loop Versiyonu ===");
        printArrayEnhanced(intArray);
        printArrayEnhanced(strArray);
        printArrayEnhanced(doubleArray);
        printArrayEnhanced(charArray);

        // Boş dizi testi
        System.out.println("\n=== Boş Dizi Testi ===");
        String[] emptyArray = {};
        printArray(emptyArray);
        System.out.println("Boş dizi yazdırıldı.");

        // Tek elemanlı dizi testi
        System.out.println("\n=== Tek Elemanlı Dizi Testi ===");
        Integer[] singleElement = {42};
        printArray(singleElement);
    }

    // Alternatif sınıf yapısı - daha esnek kullanım
    class ArrayUtils {

        // Separator parametresi ile daha esnek yazdırma
        public static <T> void printArray(T[] array, String separator) {
            if (array == null || array.length == 0) {
                System.out.println("Dizi Boş veya Null");
                return;
            }

            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]);
                if (i < array.length - 1) {
                    System.out.print(separator);
                }
            }
            System.out.println(); // Yeni satıra geç
        }

        // Varsayılan separator ile
        public static <T> void printArray(T[] array) {
            printArray(array, " ");
        }

        // Bounded type parametre örneği - Sadece Number sınıfından türeyen tipler
        public static <T extends Number> void printNumberArray(T[] array) {
            System.out.println("Sayı dizisi: ");
            printArray(array);

            // Number metotolarını kullanabiliriz
            double sum = 0;
            for (T number : array) {
                sum += number.doubleValue();
            }
            System.out.println("Toplam: " + sum);
        }
    }
}
