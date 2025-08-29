package week3;

public class GenericMetotExample {

    // Generic printArray method
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println(); // Alt satıra geçmek için
    }

    public static void main(String[] args) {

        // Integer array
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"Java", "Generics", "Ödev"};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        Character[] charArray = {'A', 'B', 'C', 'D'};

        // Metotları test et
        printArray(intArray);
        printArray(strArray);
        printArray(doubleArray);
        printArray(charArray);

    }
}
