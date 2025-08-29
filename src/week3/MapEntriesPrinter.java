package week3;

import java.util.HashMap;
import java.util.Map;

public class MapEntriesPrinter {

    public static void main(String[] args) {

        // HashMap oluşturma ve veri ekleme--
        Map<String, Integer> scores = new HashMap<>();

        scores.put("Ali", 85);
        scores.put("Ayşe", 92);
        scores.put("Mehmet", 78);
        scores.put("Zeynep", 90);
        scores.put("Burak", 88);

        // Yöntem 1: Enhanced for loop ile entry set kullanarak
        System.out.println("=== Yöntem 1: Entry Set ile ===");
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        // Yöntem 2: Key set kullanarak
        System.out.println("\n=== Yöntem 2: Key Set ile ===");
        for (String key : scores.keySet()) {
            System.out.println(key + " = " + scores.get(key));
        }

        // Yöntem 3: Java 8 Streams kullanarak
        System.out.println("\n=== Yöntem 3: Java 8 Streams ile ===");
        scores.entrySet()
                .forEach(entry -> System.out.println(entry.getKey() + " = " + entry.getValue()));

        // Yöntem 4: Map'in forEach metodunu kullanarak
        System.out.println("\n=== Yöntem 4: forEach metodu ile ===");
        scores.forEach((key, value) -> System.out.println(key + " = " + value));
    }
}