package week5.MethodReference;

import java.util.Arrays;
import java.util.List;

public class NamesPrinter {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Ahmet", "Ayşe", "Mehmet", "Zeynep");
        // For döngüsü yerine -> Method reference
        names.forEach(System.out::println);

    }
}
